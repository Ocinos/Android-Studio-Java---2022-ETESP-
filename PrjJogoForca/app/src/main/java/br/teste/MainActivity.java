package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnJogar, btnJogarNovamente;
    TextView lblGandeu, jogodaforca;
    ImageView imgCabeca, imgCorpo, imgPerna;
    EditText txtRua;

    String x = "RUA";
    String x1 = x.charAt(0) + "";
    String x2 = x.charAt(1) + "";
    String x3 = x.charAt(2) + "" ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRua = findViewById(R.id.txtRua);
        jogodaforca = findViewById(R.id.jogodaforca);
        lblGandeu = findViewById(R.id.lblGandeu);
        imgCabeca = findViewById(R.id.imgCabeca);
        imgCorpo = findViewById(R.id.imgCorpo);
        imgPerna = findViewById(R.id.imgPerna);
        btnJogar = findViewById(R.id.btnJogar);
        btnJogarNovamente = findViewById(R.id.btnJogarNovamente);
        btnJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCabeca.setImageResource(R.drawable.transparente);
                imgCorpo.setImageResource(R.drawable.transparente);
                imgPerna.setImageResource(R.drawable.transparente);
                lblGandeu.setText("") ;
            }
        });
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String dig = txtRua.text
                String dig1 = dig.charAt(0) + "";
                String dig2 = dig.charAt(1) + "";
                String dig3 = dig.charAt(3) + "";

                if(!x1.equals(dig1)){
                    imgCabeca.setImageResource(R.drawable.cabeca);
                }
                if(!x2.equals(dig2)){
                    imgCorpo.setImageResource(R.drawable.corpo);
                }
                if(!x3.equals(dig3)){
                    imgPerna.setImageResource(R.drawable.perna);
                }
                if (dig1.equals(x1))
                {
                    lblGandeu.setText( "R  ") ;
                }
                if (dig2.equals(x2))
                {
                    lblGandeu.setText(" U ") ;
                }
                if (dig3.equals(x3))
                {
                    lblGandeu.setText("  A") ;
                }
                if(dig1.equals(x1) && dig2.equals(x2))
                {
                    lblGandeu.setText("RU ");
                }
                if(dig2.equals(x2) && dig3.equals(x3))
                {
                    lblGandeu.setText( " UA");
                }
                if(dig1.equals(x1) && dig3.equals(x3))
                {
                    lblGandeu.setText("R A");
                }
                if (dig1.equals(x1) && dig2.equals(x2) && dig3.equals(x3))
                {
                    lblGandeu.setText("RUA") ;
                }
            }
        });


    }
}