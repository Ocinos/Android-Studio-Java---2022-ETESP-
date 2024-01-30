package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        Button btnJogar;
        ImageView imgDado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJogar = findViewById(R.id.btnJogar);
        imgDado = findViewById(R.id.imgDado);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int dado = rnd.nextInt(6 + 1);
                if(dado == 1){
                imgDado.setImageResource(R.drawable.dado1);
                }
                if(dado == 2){
                        imgDado.setImageResource(R.drawable.dado2);
                }
                if(dado == 3){
                    imgDado.setImageResource(R.drawable.dado3);
                }
                if(dado == 4){
                    imgDado.setImageResource(R.drawable.dado4);
                }
                if(dado == 5){
                    imgDado.setImageResource(R.drawable.dado5);
                }
                if(dado == 6){
                    imgDado.setImageResource(R.drawable.dado6);
                }
            }
        });
    }
}