package com.example.pimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaSimulacao extends AppCompatActivity {
    TextView textViewResultadoSimul;
EditText editTextRendaSimul, editTextValFinancSimul, editTextParceSimul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_simulacao);

        Button btnSolicitarTelSimul = (Button) findViewById(R.id.btnSolicSimul);
        this.editTextRendaSimul=(EditText)findViewById(R.id.txtRendaSimul);
        this.editTextValFinancSimul=(EditText)findViewById(R.id.txtValFinancSimul);
        this.editTextParceSimul=(EditText)findViewById(R.id.txtParceSimul);
        this.textViewResultadoSimul=(TextView)findViewById(R.id.ResultadoSimul);
        String renda= editTextRendaSimul.getText().toString();
        String valFinanc= editTextValFinancSimul.getText().toString();
        String parcelas= editTextParceSimul.getText().toString();
        btnSolicitarTelSimul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaAcompanhamentoSimulacao = new Intent(TelaSimulacao.this, TelaAcompanhamento.class);
                startActivity(irTelaAcompanhamentoSimulacao);
            }
        });
        Button btnVoltarSimul = (Button) findViewById(R.id.btnVoltarSimul);
        btnVoltarSimul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irTelaUsuarioVoltarSimul = new Intent(TelaSimulacao.this, TelaUsuario.class);
                startActivity(irTelaUsuarioVoltarSimul);
                //Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
            }
        });
        Button btnsimul = (Button) findViewById(R.id.btnSimul);
        btnsimul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (renda.length() < 1)
                    editTextRendaSimul.setError("Renda inválido");
                else if (valFinanc.length() < 1)
                    editTextValFinancSimul.setError("Valor do Financiamento inválido");
                else if (parcelas.length() < 10)
                    editTextParceSimul.setError("Número de Parcelas inválido");
                else {
                    double valorParcelado, valorTotal, valordoJuros, valorcomJuros;
                    double valorFinanciamento = Double.parseDouble(editTextValFinancSimul.getText().toString());
                    int numerodeParcelas = Integer.parseInt(editTextParceSimul.getText().toString());
                    valorParcelado = valorFinanciamento / numerodeParcelas;
                    valordoJuros = valorParcelado * 2 / 100;
                    valorcomJuros = valorParcelado + valordoJuros;
                    valorTotal = valorcomJuros * numerodeParcelas;
                    textViewResultadoSimul.setText("O Valor solicitado " + valorFinanciamento + "\n Parcelado em " +
                            numerodeParcelas + "\n será em parcelas" + valorcomJuros + "\n Que dá um total de " +
                            valorTotal);
                    //Toast.makeText(TelaSimulacao.this,
                    //      "O Valor solicitado "+editTextValFinancSimul.getText()+" Parcelado em "+
                    //           editTextParceSimul.getText()+" será "+valorcomJuros+" Que dá um total de "+
                    //         valorTotal, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
