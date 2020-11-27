package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaEsqueciSenha extends AppCompatActivity {
    EditText editTextCpf, editTextDtn, editTextTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_senha);

        Button btnTelEntrarEsqueciSenha = (Button) findViewById(R.id.btnLoginEsqSenha);
        this.editTextCpf=(EditText) findViewById(R.id.txtCpfEsqSenha);
        this.editTextDtn=(EditText) findViewById(R.id.txtDtnEsqSenha);
        this.editTextTelefone=(EditText) findViewById(R.id.txtTelefoneEsqSenha);
        String cpf= editTextCpf.getText().toString();
        String dtn= editTextDtn.getText().toString();
        String telefone= editTextTelefone.getText().toString();
        btnTelEntrarEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cpf.length()<11)
                    editTextCpf.setError("Cpf inválido");
                else if (dtn.length()<1)
                    editTextDtn.setError("Data de Nascimento inválido");
                else if (telefone.length()<10)
                    editTextTelefone.setError("Telefone inválido");
                else {
                    Intent irTelaUsuarioEsqueciSenha = new Intent(TelaEsqueciSenha.this, TelaUsuario.class);
                    startActivity(irTelaUsuarioEsqueciSenha);
                }
            }
        });

    }
}