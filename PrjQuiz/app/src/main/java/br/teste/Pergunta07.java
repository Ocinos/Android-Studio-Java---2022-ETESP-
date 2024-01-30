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

public class    Pergunta07 extends AppCompatActivity {

    Button BtnPeg7;
    RadioButton RdoMasked, RdoElementa, RdoDestiny, RdoVision;
    ImageView ImgHero;
    TextView LblPergunta7;
    Share cp;
    Random rnd = new Random();
    String[] y = {"Qual arquétipo de Herói que Jaden Yuki usa no anime?", "Qual arquétipo de Herói que Aster Phoenix usa no anime?", "Qual o outro arquétipo de Herói que Jaden Yuki usa no mangá?"};
    int i = rnd.nextInt(MAX);
    private static final int MAX = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta07);
        BtnPeg7 = findViewById(R.id.BtnPeg7);
        RdoDestiny = findViewById(R.id.RdoDestiny);
        RdoElementa = findViewById(R.id.RdoElemental);
        RdoVision = findViewById(R.id.RdoVision);
        RdoMasked = findViewById(R.id.RdoMasked);
        LblPergunta7 = findViewById(R.id.LblPergunta7);
        ImgHero = findViewById(R.id.ImgHero);
        BtnPeg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(),Pergunta08.class);
                if(RdoDestiny.isChecked()){
                    cp.setPeg7("Destiny");
                    startActivity(it);
                }
                else if(RdoElementa.isChecked()){
                    cp.setPeg7("Elemental");
                    startActivity(it);
                }
                else if(RdoMasked.isChecked()){
                    cp.setPeg7("Masked");
                    startActivity(it);
                }
                else if(RdoVision.isChecked()){
                    cp.setPeg7("Vision");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta7.setText(y[i]);
        switch (i){
            case 0:
                RdoDestiny.setText("Herói do Destino");
                RdoElementa.setText("Herói do Elemento");
                RdoMasked.setText("Herói Mascarado");
                RdoVision.setText("Herói da Visão");
                ImgHero.setImageResource(R.drawable.masked);
                break;
            case 1:
                RdoDestiny.setText("Herói do Elemento");
                RdoElementa.setText("Herói do Destino");
                RdoMasked.setText("Herói Mascarado");
                RdoVision.setText("Herói da Visão");
                ImgHero.setImageResource(R.drawable.plasma);
                break;
            default:
                RdoDestiny.setText("Herói do Destino");
                RdoElementa.setText("Herói Mascarado");
                RdoMasked.setText("Herói do Elemento");
                RdoVision.setText("Herói da Visão");
                ImgHero.setImageResource(R.drawable.masked);
                break;
        }
    }
}