package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSimulacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_simulacao);

        Button btnSimular = (Button) findViewById(R.id.btnSolicSimul);
        btnSimular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoSimulacao = new Intent(TelaSimulacao.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoSimulacao);
            }
        });

    }
}