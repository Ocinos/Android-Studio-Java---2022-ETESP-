package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button BtnCadastrar, BtnMostrar;
    EditText TxtNome, TxtFone;
    ListView LstDados;
    List<String> LstNomes;
    Share cp = new Share();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LstNomes = new ArrayList<String>();
        BtnCadastrar = findViewById(R.id.BtnCadastrar);
        TxtFone = findViewById(R.id.TxtFone);
        TxtNome = findViewById(R.id.TxtNome);
        BtnMostrar = findViewById(R.id.BtnMostrar);
        LstDados = findViewById(R.id.LstDados);
        LstDados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id    ) {
                String item1 = LstDados.getItemAtPosition(position).toString();
                Toast.makeText(getBaseContext(), item1, Toast.LENGTH_SHORT).show();
            }
        });
        BtnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastro = new Intent(getBaseContext(),Tela1.class);
                ArrayAdapter<String> adp = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, LstNomes);
                LstDados.setAdapter(adp);
                cadastro.putExtra("cadastro", (Serializable) LstNomes);
                startActivity(cadastro);
            }
        });
        BtnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.setNome(TxtNome.getText().toString());
                cp.setFone(TxtFone.getText().toString());
                LstNomes.add("Nome: " + cp.getNome() + " Telefone: " + cp.getFone());
               // LstNomes.add("Nome: " + TxtNome.getText().toString() + " Telefone: " + TxtFone.getText().toString());
                TxtFone.setText("");
                TxtNome.setText("");

            }

        });
    }
}