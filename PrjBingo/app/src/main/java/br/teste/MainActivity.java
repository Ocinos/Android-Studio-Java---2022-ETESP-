package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button BtnSortear, BtnChecar;
    TextView LblChecar, LblSorteio, LblTodos;
    int[] sortear = new int[MAX];
    private static final int MAX = 72;
    int c = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnChecar = findViewById(R.id.BtnChecar);
        BtnSortear = findViewById(R.id.BtnSortear);
        LblChecar = findViewById(R.id.LblChecar);
        LblSorteio = findViewById(R.id.LblSorteio);
        LblTodos = findViewById(R.id.LblTodos);
        BtnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Random rnd = new Random();
            int a = 0;
            int b;

            while(a < MAX){
                boolean acho = false;
                b = rnd.nextInt(MAX) + 1;
                for(int i = 0; i < MAX; i++)
                    if(b == sortear[i])
                        acho = true;
                if(!acho){
                    sortear[a] = b;
                    a++;
                }

            }
            LblSorteio.clearComposingText();
            for(int i = 0; i < sortear.length; i++)
                LblSorteio.setText(LblSorteio.getText() + " " + sortear[i] );
            }
        });

        BtnChecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(c < MAX){
                LblChecar.setText(sortear[c] + "");
                LblTodos.setText(LblTodos.getText() + "," + sortear[c]);
                c++;
            }
            else
             LblChecar.setText("FIM");
            }
        });
    }
}