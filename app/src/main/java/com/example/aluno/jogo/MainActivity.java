package com.example.aluno.jogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    private Button cadastrar;
    private Button limpar;
    private TextView sucess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.TextLogin);
        senha = (EditText) findViewById(R.id.TextSenha);
        cadastrar= (Button) findViewById(R.id.textcad);
        limpar = (Button) findViewById(R.id.textLimpar);

    cadastrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nomel = login.getText().toString();
            String nomes = senha.getText().toString();
            String nada = "";

        if (!nomel.equals("")&&!nomes.equals("")){
            Toast.makeText(MainActivity.this, "Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "ERRO!", Toast.LENGTH_SHORT).show();
        }




        }
    });
    limpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            login.setText("");
            senha.setText("");

        }
    });


    }
}
