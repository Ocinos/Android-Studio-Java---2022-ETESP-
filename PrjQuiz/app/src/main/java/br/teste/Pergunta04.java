package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pergunta04 extends AppCompatActivity {
    Button BtnPeg4;
    RadioButton RdoDrago, RdoVerte, RdoTrip, RdoAmbu;
    Random rnd = new Random();
    TextView LblPergunta4;
    ImageView ImgPreda;
    String[] y = {"Qual monstro Predaplant joga uma magia de fusão do deck para o cemitério e rouba o efeito dela?", "Qual o nome do Irmão do Seto Kaiba?", "Qual o segundo nome do personagem Trista?"};
    private static final int MAX = 3;
    int i = rnd.nextInt(MAX);

    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta04);
        RdoAmbu = findViewById(R.id.RdoAmbulomelides);
        RdoDrago = findViewById(R.id.RdoDragostapelia);
        RdoTrip = findViewById(R.id.RdoTriphyoverutum);
        RdoVerte = findViewById(R.id.RdoVerte);
        BtnPeg4 = findViewById(R.id.BtnPeg4);
        LblPergunta4 = findViewById(R.id.LblPergunta4);
        ImgPreda = findViewById(R.id.ImgPreda);
        BtnPeg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(), Pergunta05.class);
                if(RdoAmbu.isChecked()){
                    cp.setPeg4("Ambu");
                    startActivity(it);
                }
                else if(RdoDrago.isChecked()){
                    cp.setPeg4("Drago");
                    startActivity(it);
                }
                else if(RdoTrip.isChecked()){
                    cp.setPeg4("Trip");
                    startActivity(it);
                }
                else if(RdoVerte.isChecked()){
                    cp.setPeg4("Verte");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(), x, Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta4.setText(y[i]);
        switch (i){
            case 0:
                RdoAmbu.setText("Predaplant Ambulomelides");
                RdoDrago.setText("Predaplant Dragostapelia");
                RdoTrip.setText("Predaplant Triphyoverutum");
                RdoVerte.setText("Predaplant Verte Anaconda");
                ImgPreda.setImageResource(R.drawable.predaplantarchetype);
                break;
            case 1:
                RdoAmbu.setText("Yuya Kaiba");
                RdoDrago.setText("Lee Kaiba");
                RdoTrip.setText("José Kaiba");
                RdoVerte.setText("Mokuba Kaiba");
                ImgPreda.setImageResource(R.drawable.olho);
                break;
            default:
                RdoAmbu.setText("Muto");
                RdoDrago.setText("Ryuzen");
                RdoTrip.setText("Carlos");
                RdoVerte.setText("Taylor");
                ImgPreda.setImageResource(R.drawable.victory);
                break;
        }
    }
}