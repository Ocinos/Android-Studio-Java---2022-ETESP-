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

public class Pergunta05 extends AppCompatActivity {

    Button BtnPeg5;
    RadioButton RdoCounter, RdoQuick, RdoMonster, RdoTrap;
    TextView LblPergunta5;
    ImageView ImgSpell;
    Random rnd = new Random();
    String[] y = {"Na regra de velocidade, qual é o tipo de carta que tem a maior prioridade?", "Qual carta perde a resolução do efeito após sair do campo durante sua ativação?", "Qual carta pode sofrer corrente apenas de si mesma?"};
    private static final int MAX = 3;
    int i = rnd.nextInt(MAX);

    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta05);
        BtnPeg5 = findViewById(R.id.BtnPeg5);
        RdoCounter = findViewById(R.id.RdoCounter);
        RdoMonster = findViewById(R.id.RdoMonster);
        RdoQuick = findViewById(R.id.RdoQuick);
        LblPergunta5 = findViewById(R.id.LblPergunta5);
        ImgSpell = findViewById(R.id.ImgSpell);
        RdoTrap = findViewById(R.id.RdoTrap);
        BtnPeg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(), Pergunta06.class);
                if(RdoCounter.isChecked()){
                    cp.setPeg5("Counter");
                    startActivity(it);
                }
                else if(RdoMonster.isChecked()){
                    cp.setPeg5("Monster");
                    startActivity(it);
                }
                else if(RdoQuick.isChecked()){
                    cp.setPeg5("Quick");
                    startActivity(it);
                }
                else if(RdoTrap.isChecked()){
                    cp.setPeg5("Trap");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(), x, Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta5.setText(y[i]);
        switch (i){
            case 0:
                RdoCounter.setText("Armadilha de Resposta");
                RdoMonster.setText("(Efeito Rápido)Monstro de efeito");
                RdoQuick.setText("Magia Rápida");
                RdoTrap.setText("Armadilha Contínua");
                break;
            case 1:
                RdoCounter.setText("Armadilha Contínua");
                RdoMonster.setText("(Efeito Rápido)Monstro de efeito");
                RdoQuick.setText("Magia Rápida");
                RdoTrap.setText("Armadilha de Resposta");
                break;
            default:
                RdoCounter.setText("Armadilha de Resposta");
                RdoMonster.setText("(Efeito Rápido)Monstro de efeito");
                RdoQuick.setText("Magia Rápida");
                RdoTrap.setText("Armadilha Contínua");
                break;
        }
    }
}