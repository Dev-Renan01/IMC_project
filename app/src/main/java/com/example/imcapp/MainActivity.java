package com.example.imcapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso   = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnVoltar   = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(v -> finish());

        btnCalcular.setOnClickListener(v -> calcularIMC());
    }

    private void calcularIMC() {
        String pesoBruto   = editPeso.getText().toString().trim();
        String alturaBruta = editAltura.getText().toString().trim();

        // Validação: campos vazios — exibe pop-up
        if (pesoBruto.isEmpty() || alturaBruta.isEmpty()) {
            new AlertDialog.Builder(this)
                .setTitle("Campos obrigatórios")
                .setMessage("Por favor, preencha o peso e a altura antes de calcular.")
                .setPositiveButton("OK", null)
                .show();
            return;
        }

        double peso   = Double.parseDouble(pesoBruto);
        double altura = Double.parseDouble(alturaBruta);

        // Validação: valores inválidos — exibe pop-up
        if (peso <= 0 || altura <= 0) {
            new AlertDialog.Builder(this)
                .setTitle("Valores inválidos")
                .setMessage("Insira valores maiores que zero para peso e altura.")
                .setPositiveButton("OK", null)
                .show();
            return;
        }

        double imc = peso / (altura * altura);

        // Navega para a tela de resultado passando os dados
        Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
        intent.putExtra("imc", imc);
        intent.putExtra("peso", peso);
        intent.putExtra("altura", altura);
        startActivity(intent);
    }
}
