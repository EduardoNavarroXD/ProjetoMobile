package com.navarro.agendaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public EditText codigo;
    public EditText assunto;
    public EditText date;
    public EditText descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }//fim do metodo

    //coletar os dados do formulario
    public void coletarDadosFormulario(View view){
        this.codigo = findViewById(R.id.codigo);//coletando dado da tela e passando para a variavel codigo
        this.assunto = findViewById(R.id.assunto);//coletando dado da tela e passando para a variavel codigo
        this.date = findViewById(R.id.date);//coletando dado da tela e passando para a variavel codigo
        this.descricao = findViewById(R.id.descricao);//coletando dado da tela e passando para a variavel codigo
    }//fim do coletarDados





}// fim da classe