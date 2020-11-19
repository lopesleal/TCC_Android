package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaExibirMais extends AppCompatActivity {
    TextView textViewDtSolicitSolicitadoExibMais, textViewValFinancExibirMais, textViewParceExibMais,
            textViewNomeExibMais, textViewDtIniExibMais, textViewIdExibMais, textViewDtFinExibMais,
            textViewDtnExibMais, textViewCpfExibMais, textViewEmailExibMais, textViewJurMenExibMais,
            textViewTellExibMais, textViewValTotExibMais, textViewVencExibMais, textViewValParceExibMais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_exibir_mais);

        Button btnExibirMenos = (Button) findViewById(R.id.btnExibirMenos);
        this.textViewDtSolicitSolicitadoExibMais=(TextView) findViewById(R.id.txtDtSolicitadaExibMais);
        this.textViewValFinancExibirMais=(TextView) findViewById(R.id.txtValFinancExibMais);
        this.textViewParceExibMais=(TextView) findViewById(R.id.txtParceExibMais);
        this.textViewNomeExibMais=(TextView) findViewById(R.id.txtNomeExibMais);
        this.textViewDtIniExibMais=(TextView) findViewById(R.id.txtDtIniExibMais);
        this.textViewIdExibMais=(TextView) findViewById(R.id.txtIdExibMais);
        this.textViewDtFinExibMais=(TextView) findViewById(R.id.txtDtFinExibMais);
        this.textViewDtnExibMais=(TextView) findViewById(R.id.txtDtnExibMais);
        this.textViewCpfExibMais=(TextView) findViewById(R.id.txtCpfExibMais);
        this.textViewEmailExibMais=(TextView) findViewById(R.id.txtEmailExibMais);
        this.textViewJurMenExibMais=(TextView) findViewById(R.id.txtJurMenExibMais);
        this.textViewTellExibMais=(TextView) findViewById(R.id.txtTellExibMais);
        this.textViewValTotExibMais=(TextView) findViewById(R.id.txtValTotExibMais);
        this.textViewVencExibMais=(TextView) findViewById(R.id.txtVencExibMais);
        this.textViewValParceExibMais=(TextView) findViewById(R.id.txtValParceExibMais);
        btnExibirMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoExibirMais = new Intent(TelaExibirMais.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoExibirMais);
            }
        });

    }
}