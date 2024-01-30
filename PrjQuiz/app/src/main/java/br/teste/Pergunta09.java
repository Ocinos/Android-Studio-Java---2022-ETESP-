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

public class Pergunta09 extends AppCompatActivity {

    Button BtnPeg9;
    RadioButton RdoKalin, RdoJack, RdoYugiM, RdoCrow;
    ImageView ImgJack;
    TextView LblPergunta9;
    Share cp;
    Random rnd = new Random();
    String[] y = {"Qual é o rival principal do Yusei?", "Quem era o rival principal do Yusei?", "Qual era o melhor amigo do Yusei?"};
    int i = rnd.nextInt(MAX);
    private static final int MAX = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta09);
        BtnPeg9 = findViewById(R.id.BtnPeg9);
        RdoCrow = findViewById(R.id.RdoCrow);
        RdoJack = findViewById(R.id.RdoJack);
        RdoKalin = findViewById(R.id.RdoKalin);
        RdoYugiM = findViewById(R.id.RdoYugiM);
        ImgJack = findViewById(R.id.ImgRival);
        LblPergunta9 = findViewById(R.id.LblPergunta9);
        BtnPeg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                String x = cp.getErro();
                Intent it = new Intent(getBaseContext(), Pergunta10.class);
                if(RdoCrow.isChecked()){
                    cp.setPeg9("Crow");
                    startActivity(it);
                }
                else if(RdoJack.isChecked()){
                    cp.setPeg9("Jack");
                    startActivity(it);
                }
                else if(RdoKalin.isChecked()){
                    cp.setPeg9("Kalin");
                    startActivity(it);
                }
                else if (RdoYugiM.isChecked()){
                    cp.setPeg9("Yugi");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta9.setText(y[i]);
        switch (i){
            case 0:
                RdoCrow.setText("Crow Hogan");
                RdoJack.setText("Jack Atlas");
                RdoKalin.setText("Kalin Kessler");
                RdoYugiM.setText("Yugi Muto");
                ImgJack.setImageResource(R.drawable.jack);
                break;
            case 1:
                RdoCrow.setText("Jack Atlas");
                RdoJack.setText("Kalin Kessler");
                RdoKalin.setText("Yugi Muto");
                RdoYugiM.setText("Crow Hogan");
                ImgJack.setImageResource(R.drawable.kalin);
                break;
            default:
                RdoCrow.setText("Crow Hogan");
                RdoJack.setText("Kalin Kessler");
                RdoKalin.setText("Jack Atlas");
                RdoYugiM.setText("Yugi Muto");
                ImgJack.setImageResource(R.drawable.kalin);
                break;
        }
    }
}