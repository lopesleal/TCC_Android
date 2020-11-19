package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaBoleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_boleto);

        Button btnTelAntecipacao = (Button) findViewById(R.id.btnTelAntecipar);
        btnTelAntecipacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAntecipacao = new Intent(TelaBoleto.this, TelaAntecipacao.class);
                startActivity(irTelaAntecipacao);
            }
        });
        Button btnTelRenegociacao = (Button) findViewById(R.id.btnTelRenegociacao);
        btnTelRenegociacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaRenegociacao = new Intent(TelaBoleto.this, TelaRenegociacao.class);
                startActivity(irTelaRenegociacao);
            }
        });
        Button btnTelQuitar = (Button) findViewById(R.id.btnTelQuitar);
        btnTelQuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaQuitar = new Intent(TelaBoleto.this, TelaQuitar.class);
                startActivity(irTelaQuitar);
            }
        });

    }
}