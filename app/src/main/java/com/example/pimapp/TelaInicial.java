package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Button btnTelCadastrar = (Button) findViewById(R.id.btnTelCadastrar);
        btnTelCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaCadastro = new Intent(TelaInicial.this, TelaCadastro.class);
                startActivity(irTelaCadastro);
            }
        });
        Button btnTelLogin = (Button) findViewById(R.id.btnTelLogin);
        btnTelLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaLogin = new Intent(TelaInicial.this, TelaLogin.class);
                startActivity(irTelaLogin);
            }
        });

    }
}