package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        Button btnTelEsqueciSenha = (Button) findViewById(R.id.btnEsqSenha);
        btnTelEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaEsqueciSenha = new Intent(TelaLogin.this, TelaEsqueciSenha.class);
                startActivity(irTelaEsqueciSenha);
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaUsuarioLogin = new Intent(TelaLogin.this, TelaUsuario.class);
                startActivity(irTelaUsuarioLogin);
            }
        });

    }
}