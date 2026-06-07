package com.example.imcapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Recebe os dados da tela anterior
        double imc    = getIntent().getDoubleExtra("imc", 0);
        double peso   = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);

        TextView tvImc            = findViewById(R.id.tvImc);
        TextView tvClassificacao  = findViewById(R.id.tvClassificacao);
        TextView tvMensagem       = findViewById(R.id.tvMensagem);
        TextView tvDica           = findViewById(R.id.tvDica);
        TextView tvDetalhes       = findViewById(R.id.tvDetalhes);
        Button   btnVoltar        = findViewById(R.id.btnVoltar);

        // Exibe IMC formatado
        tvImc.setText(String.format("%.2f", imc));

        // Detalhes de peso e altura
        tvDetalhes.setText(String.format("Peso: %.1f kg  |  Altura: %.2f m", peso, altura));

        // Classificação, mensagem e cor
        String classificacao;
        String mensagem;
        String dica;
        int cor;

        if (imc < 18.5) {
            classificacao = "Abaixo do Peso";
            mensagem      = "⚠️ Atenção! Você está abaixo do peso ideal.";
            dica          = "Consulte um nutricionista para montar um plano alimentar adequado e ganhar peso de forma saudável.";
            cor           = R.color.imc_abaixo;
        } else if (imc < 25.0) {
            classificacao = "Peso Normal";
            mensagem      = "🎉 Parabéns! Você está com o peso ideal!";
            dica          = "Continue mantendo uma alimentação equilibrada e praticando atividades físicas regularmente.";
            cor           = R.color.imc_normal;
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
            mensagem      = "⚠️ Atenção! Você está com sobrepeso.";
            dica          = "Considere ajustar sua alimentação e aumentar a prática de atividades físicas. Pequenas mudanças fazem grande diferença!";
            cor           = R.color.imc_sobrepeso;
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
            mensagem      = "🚨 Cuidado! Seu IMC indica Obesidade Grau I.";
            dica          = "Procure orientação médica para um acompanhamento adequado. A saúde é o bem mais precioso!";
            cor           = R.color.imc_obesidade1;
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II";
            mensagem      = "🚨 Cuidado! Seu IMC indica Obesidade Grau II.";
            dica          = "É importante buscar acompanhamento médico especializado o quanto antes.";
            cor           = R.color.imc_obesidade2;
        } else {
            classificacao = "Obesidade Grau III";
            mensagem      = "🚨 Atenção máxima! Seu IMC indica Obesidade Grau III.";
            dica          = "Procure imediatamente um médico para iniciar um tratamento adequado. Você merece saúde e qualidade de vida!";
            cor           = R.color.imc_obesidade3;
        }

        tvClassificacao.setText(classificacao);
        tvClassificacao.setTextColor(ContextCompat.getColor(this, cor));
        tvMensagem.setText(mensagem);
        tvMensagem.setTextColor(ContextCompat.getColor(this, cor));
        tvDica.setText(dica);

        // Botão voltar — retorna para a tela de formulário
        btnVoltar.setOnClickListener(v -> finish());
    }
}
