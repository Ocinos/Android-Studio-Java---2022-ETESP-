package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtVal1, txtVal2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnSeno;
    TextView lblTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVal1 = findViewById(R.id.txtVal1);
        txtVal2 = findViewById(R.id.txtVal2);
        btnSomar = findViewById(R.id.btnSomar);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnSeno = findViewById(R.id.btnSeno);
        lblTotal = findViewById(R.id.lblTotal);

        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtVal1.getText().toString();
                String b = txtVal2.getText().toString();
                Double v1 = Double.parseDouble(a);
                Double v2 = Double.parseDouble(b);
                Double t = Math.sin(v1);
                lblTotal.setText(t + " ");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtVal1.getText().toString();
                String b = txtVal2.getText().toString();
                Double v1 = Double.parseDouble(a);
                Double v2 = Double.parseDouble(b);
                Double t = v1 / v2;
                lblTotal.setText(t + " ");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtVal1.getText().toString();
                String b = txtVal2.getText().toString();
                Double v1 = Double.parseDouble(a);
                Double v2 = Double.parseDouble(b);
                Double t = v1 * v2;
                lblTotal.setText(t + " ");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtVal1.getText().toString();
                String b = txtVal2.getText().toString();
                Double v1 = Double.parseDouble(a);
                Double v2 = Double.parseDouble(b);
                Double t = v1 - v2;
                lblTotal.setText(t + " ");
            }
        });

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtVal1.getText().toString();
                String b = txtVal2.getText().toString();
                Double v1 = Double.parseDouble(a);
                Double v2 = Double.parseDouble(b);
                Double t = v1 + v2;
               lblTotal.setText(t + " ");

            }
        });
    }
}