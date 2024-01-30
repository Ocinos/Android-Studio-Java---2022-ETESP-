package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pergunta10 extends AppCompatActivity {
    Button BtnPeg10;
    RadioButton RdoPurpura1,RdoPurpura2,RdoPurpura3,RdoPurpura4;
    ImageView ImgPurpura;
    TextView LblPergunta10;
    Random rnd = new Random();
    String[] y = {"Qual o nome completo do Dragão Purpura?", "Qual o efeito da carta Pote da Ganância?", "Qual empresa é a dona do jogo YU-Gi-Oh?"};
    int i = rnd.nextInt(MAX);
    private static final int MAX = 3;

    Share cp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta10);
        BtnPeg10 = findViewById(R.id.BtnPeg10);
        RdoPurpura1 = findViewById(R.id.RdoPurpura1);
        RdoPurpura2 = findViewById(R.id.RdoPurpura2);
        RdoPurpura3 = findViewById(R.id.RdoPurpura3);
        RdoPurpura4 = findViewById(R.id.RdoPurpura4);
        ImgPurpura = findViewById(R.id.ImgPurpura);
        LblPergunta10 = findViewById(R.id.LblPergunta10);
        BtnPeg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp = new Share();
                Intent it = new Intent(getBaseContext(), Final.class);
                String x = cp.getErro();
                if(RdoPurpura1.isChecked()){
                    cp.setPeg10("1");
                    startActivity(it);
                }
                else if(RdoPurpura2.isChecked()){
                    cp.setPeg10("2");
                    startActivity(it);
                }
                else if(RdoPurpura3.isChecked()){
                    cp.setPeg10("3");
                    startActivity(it);
                }
                else if (RdoPurpura4.isChecked()){
                    cp.setPeg10("4");
                    startActivity(it);
                }
                else{
                    Toast.makeText(getBaseContext(),x,Toast.LENGTH_SHORT).show();
                }
            }
        });
        LblPergunta10.setText(y[i]);
        switch (i){
            case 0:
                RdoPurpura1.setText("Dragão Interplanetariopurpuraespinhoso");
                RdoPurpura2.setText("Dragão Purpura da Aniquilação");
                RdoPurpura3.setText("Dragão Eclipsepurpuraespinhosodastrevas");
                RdoPurpura4.setText("Dragão Demoníacopurpuraespinhosodosubmundo");
                break;
            case 1:
                RdoPurpura1.setText("Compre 2 cartas");
                RdoPurpura2.setText("Ganhe o Duelo");
                RdoPurpura3.setText("Jogue sua mão inteira fora, depois compre a mesma quantidade de cartas");
                RdoPurpura4.setText("Invoque um monstro do seu deck de nível 4 ou menor");
                break;
            default:
                RdoPurpura1.setText("Konami");
                RdoPurpura2.setText("Sony");
                RdoPurpura3.setText("Microsoft");
                RdoPurpura4.setText("EA");
                break;
        }

    }
}