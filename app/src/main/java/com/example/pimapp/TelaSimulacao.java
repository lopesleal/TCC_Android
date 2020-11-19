package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class TelaSimulacao extends AppCompatActivity {
EditText editTextRendaSimul, editTextValFinancSimul, editTextParceSimul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_simulacao);

        Button btnSolicitarTelSimul = (Button) findViewById(R.id.btnSolicSimul);
        this.editTextRendaSimul=(EditText)findViewById(R.id.txtRendaSimul);
        this.editTextValFinancSimul=(EditText)findViewById(R.id.txtValFinancSimul);
        this.editTextParceSimul=(EditText)findViewById(R.id.txtParceSimul);
        btnSolicitarTelSimul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoSimulacao = new Intent(TelaSimulacao.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoSimulacao);
            }
        });
        double valorRenda= Double.parseDouble(editTextRendaSimul.getText().toString());
        double valorFinanciamento= Double.parseDouble(editTextValFinancSimul.getText().toString());
        int numerodeParcelas= Integer.parseInt(editTextParceSimul.getText().toString());
        double resultado= valorFinanciamento/numerodeParcelas;




    }
}