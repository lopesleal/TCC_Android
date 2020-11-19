package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class TelaAntecipacao extends AppCompatActivity {
EditText editTextParcelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_antecipacao);
        this.editTextParcelas=(EditText) findViewById(R.id.txtParceAntec);
    }
}