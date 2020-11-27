package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {
    EditText editTextLogin, editTextSenhaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        Button btnTelEsqueciSenha = (Button) findViewById(R.id.btnEsqSenha);
        this.editTextLogin=(EditText) findViewById(R.id.txtLogin);
        this.editTextSenhaLogin=(EditText) findViewById(R.id.txtSenhaLogin);
        String login= editTextLogin.getText().toString();
        String senha= editTextSenhaLogin.getText().toString();
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
                if (!login.contains("@"))
                    editTextLogin.setError("Email inválido");
                else if (senha.length()<6)
                    editTextSenhaLogin.setError("Senha deve ter pelo menos 6 caracteres");
                else {
                    Intent irTelaUsuarioLogin = new Intent(TelaLogin.this, TelaUsuario.class);
                    startActivity(irTelaUsuarioLogin);
                }
            }
        });

    }
}