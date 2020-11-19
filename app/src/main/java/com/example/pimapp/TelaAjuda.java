package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaAjuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ajuda);

        Button btnVoltarAjuda = (Button) findViewById(R.id.btnVoltarAjud);
        btnVoltarAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaUsuariobtnVoltar = new Intent(TelaAjuda.this, TelaUsuario.class);
                startActivity(irTelaUsuariobtnVoltar);
            }
        });

    }
}