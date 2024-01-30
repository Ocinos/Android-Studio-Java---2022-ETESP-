package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cp = new Share("ETESP");
        //cp.setTexto("Bom dia");//o texto é parametro
        Intent it = new Intent(getBaseContext(), Tela1.class);
        startActivity(it);
    }
}