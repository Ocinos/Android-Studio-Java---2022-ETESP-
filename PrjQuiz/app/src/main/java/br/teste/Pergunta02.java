package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pergunta02 extends AppCompatActivity {

    Button BtnPeg2;
    RadioButton RdoAtem, RdoOsiris, RdoYusei, RdoYugi;
    ImageView ImgFarao;
    TextView LblPergunta2;
    private static final int MAX = 3;
    Random rnd = new Random();
    String[] y = {"Qual o nome do Faraó/Yami?", "Qual desses é um monstro Zoodiac?", "Qual o custo para invocar o Gameciel, the Sea Turtle Kaiju no campo do oponente?"};
    int i = rnd.nextInt(MAX);

    Share cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta02);
        BtnPeg2 = findViewById(R.id.BtnPeg2);
        RdoAtem = findViewById(R.id.RdoAtem);
        RdoOsiris = findViewById(R.id.RdoOsiris);
        RdoYugi = findViewById(R.id.RdoYugi);
        RdoYusei = findViewById(R.id.RdoYusei);
        ImgFarao = findViewById(R.id.ImgFarao);
        LblPergunta2 = findViewById(R.id.LblPergunta2);
        BtnPeg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                Intent it = new Intent(getBaseContext(), Pergunta03.class);
                String x = cp.getErro();
                if(RdoAtem.isChecked()){
                    cp.setPeg2("Atem");
                    startActivity(it);
                }
                else if(RdoOsiris.isChecked()){
                    cp.setPeg2("Osiris");
                    startActivity(it);
                }
                else if(RdoYugi.isChecked()){
                    cp.setPeg2("Yugi");
                    startActivity(it);
                }
                else if(RdoYusei.isChecked()){
                    cp.setPeg2("Yusei");
                    startActivity(it);
                }
                else {
                    Toast.makeText(getBaseContext(), x, Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta2.setText(y[i]);
        switch (i){
            case 0:
                RdoAtem.setText("Atém");
                RdoOsiris.setText("Osiris");
                RdoYugi.setText("Yugi");
                RdoYusei.setText("Yusei");
                ImgFarao.setImageResource(R.drawable.yamiyugi);
                break;
            case 1:
                RdoAtem.setText("Drident");
                RdoOsiris.setText("Kuriboh");
                RdoYugi.setText("Exódia");
                RdoYusei.setText("Gamma");
                ImgFarao.setImageResource(R.drawable.zoo);
                break;
            default:
                RdoAtem.setText("Tributar um Monstro");
                RdoOsiris.setText("Banir um Monstro");
                RdoYugi.setText("Ter um Monstro no campo");
                RdoYusei.setText("Enviar um Monstro da Mão para o Cemitério");
                ImgFarao.setImageResource(R.drawable.gameciel);
                break;
        }
    }
}