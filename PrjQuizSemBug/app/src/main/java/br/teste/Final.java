package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    Button BtnRestart;
    TextView LblResposta;
    int pontos = 0;
    String resp1 = "";
    String resp2 = "";
    String resp3 = "";
    String resp4 = "";
    String resp5 = "";
    String resp6 = "";
    String resp7 = "";
    String resp8 = "";
    String resp9 = "";
    String resp10 = "";
    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        BtnRestart = findViewById(R.id.BtnRestart);
        LblResposta = findViewById(R.id.LblResposta);
        BtnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(),MainActivity.class);
                resp1 = "";
                resp2 = "";
                resp3 = "";
                resp4 = "";
                resp5 = "";
                resp6 = "";
                resp7 = "";
                resp8 = "";
                resp9 = "";
                resp10 = "";
                LblResposta.setText("");
                pontos = 0;
                startActivity(it);
            }
        });
        cp = new Share();
        resp1 = cp.getPeg1();
        resp2 = cp.getPeg2();
        resp3 = cp.getPeg3();
        resp4 = cp.getPeg4();
        resp5 = cp.getPeg5();
        resp6 = cp.getPeg6();
        resp7 = cp.getPeg7();
        resp8 = cp.getPeg8();
        resp9 = cp.getPeg9();
        resp10 = cp.getPeg10();
        if(resp1.equals("BE"))
            pontos++;
        if(resp2.equals("Atem"))
            pontos++;
        if(resp3.equals("Exodia"))
            pontos++;
        if(resp4.equals("Verte"))
            pontos++;
        if(resp5.equals("Counter"))
            pontos++;
        if(resp6.equals("Wyrm"))
            pontos++;
        if(resp7.equals("Elemental"))
            pontos++;
        if(resp8.equals("Thunder"))
            pontos++;
        if(resp9.equals("Jack"))
            pontos++;
        if(resp10.equals("1"))
            pontos++;

        if(pontos == 10){
            LblResposta.setText("Você acertou: "+pontos+"/10! Você realmente sabe sobre Yu-Gi-Oh");
        }
        else if (pontos < 10 && pontos > 6) {
            LblResposta.setText("Você acertou: "+pontos+"/10! Chegou perto, boa sorte na próxima!");
        }
        else if(pontos < 7 && pontos > 4 ){
            LblResposta.setText("Você acertou: "+pontos+"/10! Experimente ver mais sobre Yu-Gi-Oh, na próxima você pode conseguir!");
        }
        else {
            LblResposta.setText("Você acertou: "+pontos+"/10! Você é um duelista de quinta categoria com um deck de sexta categoria!");
        }

    }

}
