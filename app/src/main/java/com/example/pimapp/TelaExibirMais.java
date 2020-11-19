package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaExibirMais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_exibir_mais);

        Button btnExibirMenos = (Button) findViewById(R.id.btnExibirMenos);
        btnExibirMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoExibirMais = new Intent(TelaExibirMais.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoExibirMais);
            }
        });

    }
}