package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {
    private EditText editTextNome, editTextCpf, editTextDtn, editTextTelefone, editTextEmail,
            editTextSenha, editTextConfSenha, editTextCep, editTextRua, editTextNumero,
            editTextBairro, editTextCidade, editTextEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        this.editTextNome=(EditText) findViewById(R.id.txtNome);
        this.editTextCpf=(EditText) findViewById(R.id.txtCpf);
        this.editTextDtn=(EditText) findViewById(R.id.txtDtn);
        this.editTextTelefone=(EditText) findViewById(R.id.txtTelefone);
        this.editTextEmail=(EditText) findViewById(R.id.txtEmail);
        this.editTextSenha=(EditText) findViewById(R.id.txtSenhaCad);
        this.editTextConfSenha=(EditText) findViewById(R.id.txtConfSenha);
        this.editTextCep=(EditText) findViewById(R.id.txtCep);
        this.editTextRua=(EditText) findViewById(R.id.txtRua);
        this.editTextNumero=(EditText) findViewById(R.id.txtNumero);
        this.editTextBairro=(EditText) findViewById(R.id.txtBairro);
        this.editTextCidade=(EditText) findViewById(R.id.txtCidade);
        this.editTextEstado=(EditText) findViewById(R.id.txtEstado);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(editTextSenha!=editTextConfSenha)
                    Toast.makeText(getApplicationContext(),"Senha diferentes", Toast.LENGTH_LONG).show();
                else {
                    Intent irTelaInicialCadastro = new Intent(TelaCadastro.this, TelaInicial.class);
                    startActivity(irTelaInicialCadastro);
                }
            }
        });


    }
}