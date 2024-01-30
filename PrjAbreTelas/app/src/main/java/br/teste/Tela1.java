package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {
    Button BtnAbreTela2;
    Share cp = new Share();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        String x = cp.getNome();

        Toast.makeText(getBaseContext(), x, Toast.LENGTH_LONG).show();

        BtnAbreTela2 = findViewById(R.id.BtnAbreTela2);
        BtnAbreTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), Tela2.class);
                startActivity(it);


            }
        });
    }
}