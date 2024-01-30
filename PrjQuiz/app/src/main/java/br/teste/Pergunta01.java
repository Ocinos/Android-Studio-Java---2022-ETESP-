package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pergunta01 extends AppCompatActivity {
    Button BtnPeg1;
    RadioButton RdoBE, RdoRE, RdoDM, RdoAzure;
    TextView LblPergunta1;
    ImageView ImgKaiba;
    private static final int MAX = 3;
    Random rnd = new Random();
    String[] y = {"Qual é a carta assinatura do personagem Seto Kaiba?", "Qual é a carta assinatura do personagem Yugi Muto?", "Qual é a carta assinatura do personagem Joey Wheeler?"};
    int i = rnd.nextInt(MAX);

    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta01);
        BtnPeg1 = findViewById(R.id.BtnPeg1);
        LblPergunta1 = findViewById(R.id.LblPergunta1);
        ImgKaiba = findViewById(R.id.ImgKaiba);
        RdoAzure = findViewById(R.id.RdoAzure);
        RdoBE = findViewById(R.id.RdoBE);
        RdoRE = findViewById(R.id.RdoRE);
        RdoDM = findViewById(R.id.RdoDM);
        BtnPeg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                Intent it = new Intent((getBaseContext()), Pergunta02.class);
                if(RdoAzure.isChecked()){
                    cp.setPeg1("AE");
                    startActivity(it);
                }
                else if(RdoBE.isChecked()){
                    cp.setPeg1("BE");
                    startActivity(it);
                }
                else if(RdoRE.isChecked()){
                    cp.setPeg1("RE");
                    startActivity(it);
                }
                else if(RdoDM.isChecked()){
                    cp.setPeg1("DM");
                    startActivity(it);
                }
                else{
                    String x = cp.getErro();
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta1.setText(y[i]);
        switch (i){
            case 0:
                RdoAzure.setText("Dragão Prateado dos Olhos Cerúleos");
                RdoBE.setText("Dragão Branco dos Olhos Azuis");
                RdoDM.setText("Mago Negro");
                RdoRE.setText("Dragão Negro dos Olhos Vermelhos");
                ImgKaiba.setImageResource(R.drawable.kaiba);
                break;
            case 1:
                RdoAzure.setText("Dragão Prateado dos Olhos Cerúleos");
                RdoRE.setText("Dragão Branco dos Olhos Azuis");
                RdoDM.setText("Dragão Negro dos Olhos Vermelhos");
                RdoBE.setText("Mago Negro");
                ImgKaiba.setImageResource(R.drawable.yugimuto);
                break;
            default:
                RdoAzure.setText("Dragão Branco dos Olhos Azuis");
                RdoRE.setText("Mago Negro");
                RdoBE.setText("Dragão Negro dos Olhos Vermelhos");
                RdoDM.setText("Dragão Prateado dos Olhos Cerúleos");
                ImgKaiba.setImageResource(R.drawable.joey);
        }
    }
}