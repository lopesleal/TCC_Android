package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaRenegociacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_renegociacao);

        Button btnVoltarTelRenegociaocao = (Button) findViewById(R.id.btnVoltarTelRenegociacao);
        btnVoltarTelRenegociaocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaBoletoRenegociacao = new Intent(TelaRenegociacao.this, TelaBoleto.class);
                startActivity(irTelaBoletoRenegociacao);
            }
        });

    }
}