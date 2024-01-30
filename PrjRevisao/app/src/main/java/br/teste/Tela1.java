package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    Share cp = new Share();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        String x = cp.getTexto();
        Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
    }
}