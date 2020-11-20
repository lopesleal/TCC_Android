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
                String nome=editTextNome.getText().toString();
                String cpf= editTextCpf.getText().toString();
                String dtn= editTextDtn.getText().toString();
                String telefone= editTextTelefone.getText().toString();
                String email=editTextEmail.getText().toString();
                String senha = editTextSenha.getText().toString();
                String confSenha = editTextConfSenha.getText().toString();
                String cep=editTextCep.getText().toString();
                String rua=editTextRua.getText().toString();
                String numero=editTextNumero.getText().toString();
                String bairro=editTextBairro.getText().toString();
                String cidade=editTextCidade.getText().toString();
                String estado=editTextEstado.getText().toString();
                if (nome.length()<3)
                    editTextNome.setError("Nome inválido");
                else if (cpf.length()<11)
                    editTextCpf.setError("Cpf inválido");
                else if (dtn.length()<1)
                    editTextDtn.setError("Data de Nascimento inválido");
                else if (telefone.length()<10)
                    editTextTelefone.setError("Telefone inválido");
                else if (!email.contains("@"))
                   editTextEmail.setError("Email inválido");
                else if (senha.length()<6)
                    editTextSenha.setError("Senha deve ter pelo menos 6 caracteres");
                else if(!senha.equals(confSenha))
                   editTextConfSenha.setError("Senha diferente");
                else if (cep.length()<9)
                    editTextCep.setError("Cep inválido");
                else if (rua.length()<5)
                    editTextRua.setError("Endereço inválido");
                else if (numero.length()<1)
                    editTextNumero.setError("Numero inválido");
                else if (bairro.length()<5)
                    editTextBairro.setError("Bairro inválido");
                else if (cidade.length()<5)
                    editTextCidade.setError("Cidade inválido");
                else if (estado.length()<1)
                    editTextEstado.setError("Estado inválido");
                else {
                    Intent irTelaInicialCadastro = new Intent(TelaCadastro.this, TelaInicial.class);
                    startActivity(irTelaInicialCadastro);
                }
            }
        });


    }
}