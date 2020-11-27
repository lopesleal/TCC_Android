package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaAntecipacao extends AppCompatActivity {
 private EditText editTextParcelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_antecipacao);
        this.editTextParcelas=(EditText) findViewById(R.id.txtParceAntec);
        String parcelas = editTextParcelas.getText().toString();
        Button btnGerarBoletoAntec = (Button) findViewById(R.id.btnGerarBoletoAntec);
        btnGerarBoletoAntec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            if (parcelas.length()<1)
                editTextParcelas.setError("Número de parcelas inválido");
        }
    }
}
}