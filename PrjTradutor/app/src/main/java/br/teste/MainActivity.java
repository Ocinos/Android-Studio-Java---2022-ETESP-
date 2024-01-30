package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button BtnTraduzir;
    EditText TxtTradutor;
    TextView LblTradutor;

    String[] pot = {"Mesa", "Cadeira", "Caneta"};
    String[] ing = {"Table", "Chair", "Pen"};
    int pos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnTraduzir = findViewById(R.id.BtnTraduzir);
        TxtTradutor = findViewById(R.id.TxtTradutor);
        LblTradutor = findViewById(R.id.LblTradutor);
        BtnTraduzir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig = TxtTradutor.getText().toString();
            for(int i = 0; i < pot.length; i++){
                if(dig.equals(pot[i])){
                    pos = i;
                    break;
                }
            }
            LblTradutor.setText(ing[pos]);
            }
        });

    }
}