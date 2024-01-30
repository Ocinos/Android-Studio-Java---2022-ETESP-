package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button BtnAbreTela1;
        RadioButton RdoOp1, RdoOp2, RdoOp3;

        Share cp = new Share();//Voce pode declarar e instanciar separadamente, assim:
        //Share cp; ta declarado

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnAbreTela1 = findViewById(R.id.BtnAbreTela1);
        RdoOp1 = findViewById(R.id.RdoOp1);
        RdoOp2 = findViewById(R.id.RdoOp2);
        RdoOp3 = findViewById(R.id.RdoOp3);
        RdoOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RdoOp1.isChecked())
                   Toast.makeText(getBaseContext(), "Jogo", Toast.LENGTH_SHORT).show();
            }
        });

        BtnAbreTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cp = new Share(); o problema é que o New apaga oq tava armazenado antes
                cp.setNome("AAAAA");
                Intent/*Classe*/it = new Intent(/*pega o contexto de onde estou, exemplo MainAcitivy.this(mas manual)*/getBaseContext()/*Método construtor*/,Tela1.class);//Intent faz qualquer coisa, o construtor muda de acordo com a necessidade
                startActivity(it);

            }
        });
    }
}