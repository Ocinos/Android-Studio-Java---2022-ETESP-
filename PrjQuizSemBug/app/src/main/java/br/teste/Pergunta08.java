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

public class Pergunta08 extends AppCompatActivity {
    Button BtnPeg8;
    RadioButton RdoDragon, RdoThunder, RdoWyrm, RdoBesta;
    ImageView ImgThunder;
    TextView LblPergunta8;
    Share cp;
    Random rnd = new Random();
    String[] y = {"Qual tipo de monstro os Thunder Dragon são?", "Qual o nome deste Thunder Dragon?", "Qual o nível deste Thunder Dragon?"};
    int i = rnd.nextInt(MAX);
    private static final int MAX = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta08);
        BtnPeg8 = findViewById(R.id.BtnPeg8);
        RdoDragon = findViewById(R.id.RdoDragon);
        RdoBesta = findViewById(R.id.RdoBesta);
        RdoThunder = findViewById(R.id.RdoTrovao);
        RdoWyrm = findViewById(R.id.RdoWyrms);
        LblPergunta8 = findViewById(R.id.LblPergunta8);
        ImgThunder = findViewById(R.id.ImgTD);
        BtnPeg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(), Pergunta09.class);
                if(RdoWyrm.isChecked()){
                    cp.setPeg8("Wyrm");
                    startActivity(it);
                }
                else if(RdoDragon.isChecked()){
                    cp.setPeg8("Dragon");
                    startActivity(it);
                }
                else if(RdoBesta.isChecked()){
                    cp.setPeg8("Besta");
                    startActivity(it);
                }
                else if(RdoThunder.isChecked()){
                    cp.setPeg8("Thunder");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(), x, Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta8.setText(y[i]);
        switch (i){
            case 0:
                RdoBesta.setText("Tipo Besta");
                RdoDragon.setText("Tipo Dragão");
                RdoThunder.setText("Tipo Trovão");
                RdoWyrm.setText("Tipo Wyrm");
                break;
            case 1:
                RdoBesta.setText("Roar");
                RdoDragon.setText("Colossus");
                RdoThunder.setText("Hawk");
                RdoWyrm.setText("Titan");
                break;
            default:
                RdoBesta.setText("8");
                RdoDragon.setText("5");
                RdoThunder.setText("6");
                RdoWyrm.setText("4");
                break;
        }
    }
}