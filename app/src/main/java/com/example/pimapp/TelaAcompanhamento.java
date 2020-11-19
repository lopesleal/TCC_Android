package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaAcompanhamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_acompanhamento);

        Button btnTelExibirMais = (Button) findViewById(R.id.btnTelExibMais);
        btnTelExibirMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaExibirMais = new Intent(TelaAcompanhamento.this, TelaExibirMais.class);
                startActivity(irTelaExibirMais);
            }
        });
        Button btnTelBoletoAcomp = (Button) findViewById(R.id.btnTelBoletoAcomp);
        btnTelBoletoAcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaBoleto = new Intent(TelaAcompanhamento.this, TelaBoleto.class);
                startActivity(irTelaBoleto);
            }
        });
        Button btnVoltarTelAcomp = (Button) findViewById(R.id.btnVoltarTelAcomp);
        btnVoltarTelAcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaUsuarioTelAcomp = new Intent(TelaAcompanhamento.this, TelaUsuario.class);
                startActivity(irTelaUsuarioTelAcomp);
            }
        });


    }
}