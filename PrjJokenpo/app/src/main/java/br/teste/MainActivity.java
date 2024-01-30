package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        Button btnPedra, btnPapel, btnTesoura;
        ImageView  imgMaquina, imgJogador;
        TextView txtPontuacaoJogador, txtPontuacaoMaquina;
    int pontomaquina = 0;
    int pontojogador = 0;
    int i = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgJogador = findViewById(R.id.imgJogador);
        btnPedra = findViewById(R.id.btnPedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnTesoura);
        imgMaquina = findViewById(R.id.imgMaquina);


        txtPontuacaoJogador = findViewById(R.id.txtPontuacaoJogador);
        txtPontuacaoMaquina = findViewById(R.id.txtPontuacaoMaquina);


        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJogador.setImageResource(R.drawable.tesoura);
                Random rnd = new Random();
                int maquina = rnd.nextInt(3 + 1);

                if(maquina == 1){
                    imgMaquina.setImageResource(R.drawable.pedra);


                    pontomaquina++;
                    txtPontuacaoMaquina.setText(""+ pontomaquina);


                }
                if(maquina == 2){
                    imgMaquina.setImageResource(R.drawable.papel);

                    pontojogador++;
                    txtPontuacaoJogador.setText("" + pontojogador);

                }
                if(maquina == 3){
                    imgMaquina.setImageResource(R.drawable.tesoura);

                }
            }
        });
        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJogador.setImageResource(R.drawable.papel);
                Random rnd = new Random();
                int maquina = rnd.nextInt(3 + 1);
                if(maquina == 1){
                    imgMaquina.setImageResource(R.drawable.pedra);

                    pontojogador++;
                    txtPontuacaoJogador.setText("" + pontojogador);
                }
                if(maquina == 2){
                    imgMaquina.setImageResource(R.drawable.papel);

                }
                if(maquina == 3){
                    imgMaquina.setImageResource(R.drawable.tesoura);

                    pontomaquina++;
                    txtPontuacaoMaquina.setText(""+ pontomaquina);
                }

            }
        });
        btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgJogador.setImageResource(R.drawable.pedra);
                Random rnd = new Random();
                int maquina = rnd.nextInt(3 + 1);
                if(maquina == 1){
                    imgMaquina.setImageResource(R.drawable.pedra);

                }
                if(maquina == 2){
                    imgMaquina.setImageResource(R.drawable.papel);

                   pontomaquina++;
                    txtPontuacaoMaquina.setText(""+ pontomaquina);
                }
                if(maquina == 3){
                    imgMaquina.setImageResource(R.drawable.tesoura);

                    pontojogador++;
                    txtPontuacaoJogador.setText("" + pontojogador);
                }

            }

        });



    }
}