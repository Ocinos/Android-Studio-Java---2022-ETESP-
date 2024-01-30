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

public class Pergunta03 extends AppCompatActivity {

    Button BtnPeg3;
    RadioButton RdoRa, RdoSlifer, RdoExodia, RdoObelisco;
    Share cp;
    TextView LblPergunta3;
    ImageView ImgEnigma;
    Random rnd = new Random();
    String[] y = {"O que significa TCG?", "O que significa OCG?", "Qual carta vence o duelo após juntar todas as 5 partes dela?"};
    private static final int MAX = 3;
    int i = rnd.nextInt(MAX);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta03);
        BtnPeg3 = findViewById(R.id.BtnPeg3);
        RdoExodia = findViewById(R.id.RdoExodia);
        RdoObelisco = findViewById(R.id.RdoObelisco);
        RdoRa = findViewById(R.id.RdoRa);
        RdoSlifer = findViewById(R.id.RdoSlifer);
        LblPergunta3 = findViewById(R.id.LblPergunta3);
        ImgEnigma = findViewById(R.id.ImgEnigma);
        BtnPeg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                Intent it = new Intent(getBaseContext(),Pergunta04.class);
                String x = cp.getErro();
                if(RdoExodia.isChecked()){
                    cp.setPeg3(("Exodia"));
                    startActivity(it);
                }
                else if(RdoObelisco.isChecked()){
                    cp.setPeg3("Obelisco");
                    startActivity(it);
                }
                else if(RdoRa.isChecked()){
                    cp.setPeg3("Ra");
                    startActivity(it);
                }
                else if(RdoSlifer.isChecked()){
                    cp.setPeg3("Slifer");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta3.setText(y[i]);
        switch (i){
            case 0:
                RdoExodia.setText("Trading Card Game");
                RdoObelisco.setText("Typhoon Card Game");
                RdoRa.setText("Traditional Card Game");
                RdoSlifer.setText("Trunks Card Game");
                break;
            case 1:
                RdoExodia.setText("Original Card Game");
                RdoObelisco.setText("Oriental Card Game");
                RdoRa.setText("Ocidental Card Game");
                RdoSlifer.setText("Omega Card Game");
                break;
            default:
                RdoExodia.setText("Exódia, o Proibido");
                RdoObelisco.setText("Obelisco, o Atormentador");
                RdoRa.setText("O Dragão Alado de Rá");
                RdoSlifer.setText("Slifer, o Dragão do Céu");
                break;
        }
    }
}