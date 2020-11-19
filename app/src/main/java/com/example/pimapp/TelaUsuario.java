package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_usuario);

        Button btnTelFinanciamento = (Button) findViewById(R.id.btnTelSimulFinanc);
        btnTelFinanciamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaSimulacao = new Intent(TelaUsuario.this, TelaSimulacao.class);
                startActivity(irTelaSimulacao);
            }
        });
        Button btnTelAcompanhamento = (Button) findViewById(R.id.btnTelAcomp);
        btnTelAcompanhamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoUsuario = new Intent(TelaUsuario.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoUsuario);
            }
        });
        Button btnTelAjuda = (Button) findViewById(R.id.btnTelAjud);
        btnTelAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAjuda = new Intent(TelaUsuario.this, TelaAjuda.class);
                startActivity(irTelaAjuda);
            }
        });

    }
}