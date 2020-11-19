package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEsqueciSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_senha);

        Button btnTelEntrarEsqueciSenha = (Button) findViewById(R.id.btnLoginEsqSenha);
        btnTelEntrarEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaUsuarioEsqueciSenha = new Intent(TelaEsqueciSenha.this, TelaUsuario.class);
                startActivity(irTelaUsuarioEsqueciSenha);
            }
        });

    }
}