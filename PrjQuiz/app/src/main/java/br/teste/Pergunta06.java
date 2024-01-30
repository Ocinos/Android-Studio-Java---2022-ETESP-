package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pergunta06 extends AppCompatActivity {

    Button BtnPeg6;
    RadioButton RdoWyrm, RdoFada, RdoDemonio, RdoDragon;
    ImageView ImgKing;
    TextView LblPergunta6;
    Share cp;
    Random rnd = new Random();
    String[] y = {"Qual o tipo de monstro o True King of All Calamities é?", "Qual o atributo do True King of All Calamities é?", "Como chamam geralmente o True King of All Calamities é?"};
    private static final int MAX = 3;
    int i = rnd.nextInt(MAX);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta06);
        BtnPeg6 = findViewById(R.id.BtnPeg6);
        RdoDemonio = findViewById(R.id.RdoDemonio);
        RdoDragon = findViewById(R.id.RdoDragao);
        RdoFada = findViewById(R.id.RdoFada);
        RdoWyrm = findViewById(R.id.RdoWyrm);
        LblPergunta6 = findViewById(R.id.LblPergunta6);
        ImgKing = findViewById(R.id.ImgKing);
        BtnPeg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(),Pergunta07.class);
                if(RdoDemonio.isChecked()){
                    cp.setPeg6("Demonio");
                    startActivity(it);
                }
                else if(RdoDragon.isChecked()){
                    cp.setPeg6("Dragon");
                    startActivity(it);
                }
                else if(RdoFada.isChecked()){
                    cp.setPeg6("Fada");
                    startActivity(it);
                }
                else if(RdoWyrm.isChecked()){
                    cp.setPeg6("Wyrm");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta6.setText(y[i]);
        switch (i){
            case 0:
            RdoDemonio.setText("Tipo Demônio");
            RdoDragon.setText("Tipo Dragão");
            RdoFada.setText("Tipo Fada");
            RdoWyrm.setText("Tipo Wyrm");
                break;
            case 1:
                RdoDemonio.setText("Divino");
                RdoDragon.setText("Vento");
                RdoFada.setText("Luz");
                RdoWyrm.setText("Trevas");
                break;
            default:
                RdoDemonio.setText("TKC");
                RdoDragon.setText("Monstro escroto");
                RdoFada.setText("Perdi");
                RdoWyrm.setText("VFD");
                break;
        }
    }
}