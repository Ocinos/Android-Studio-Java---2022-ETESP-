package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button BtnCalcular;
    TextView LblResp;
    EditText txtNome;
    DatePicker DpData;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DpData = findViewById(R.id.DpData);
        txtNome = findViewById(R.id.txtNome);
        BtnCalcular = findViewById(R.id.BtnCalcular);
        LblResp = findViewById(R.id.LblResp);
        BtnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int diaNasc = DpData.getDayOfMonth();
                    int droga = DpData.getMonth();
                    int mesNasc = droga+1;
                    int anoNasc = DpData.getYear();

                    String born = diaNasc + "/" + mesNasc + "/" + anoNasc;
                    SimpleDateFormat dates = new SimpleDateFormat("dd/MM/yyyy");
                    Date atual = GregorianCalendar.getInstance().getTime();
                    Date nasc = dates.parse(born);

                    long diferenca = Math.abs(atual.getTime() - nasc.getTime());
                    long diferencaData = diferenca /(24*60*60*1000);
                    int idade = Integer.parseInt(String.valueOf(diferencaData))/365;
                    int idadeProx = idade + 1;

                    int anoAtual = Calendar.getInstance();
                    int anoProx = anoAtual+1;
                    int diaAniv = nasc.getDay();
                    int mesAniv = nasc.getMonth();
                    String aniv = diaAniv+"/"+mesAniv+"/"+anoProx;
                    Date x = dates.parse(aniv);
                    long diasAniv = Math.abs(x.getTime() - atual.getTime());
                    long diferencaDiasAniv = diasAniv/(24 * 60 * 60 * 1000);

                    LblResp.setText("Nome: "+txtNome.getText().toString() + "\nIdade: " + idade + "\nVai fazer " + idadeProx + " daqui " +diferencaDiasAniv+ " dias");
                }
                catch(Exception exception){
                    Toast.makeText(getBaseContext(),"Erro", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}