package com.devmasterteam.conversaodemoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Contém os elementos da tela em questão. Faz o carregamento uma única vez e pode ser usado a qualquer momento dentro da classe.
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Insere o layout na activity
        setContentView(R.layout.activity_main);

        // Busca os elementos da interface
        this.mViewHolder.editReal = this.findViewById(R.id.edit_real);
        this.mViewHolder.textDollar = this.findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = this.findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = this.findViewById(R.id.button_calculate);

        // Limpa os valores iniciais
        this.clearValues();

        // Adiciona evento de click no elemento
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Verifica se o elemento clicado é o que nos interessa
        if (view.getId() == R.id.button_calculate) {

            String value = this.mViewHolder.editReal.getText().toString();
            if ("".equals(value)) {
                Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
            } else {
                // Converte o valor informado
                Double real = Double.valueOf(value);

                // Converte valores
                this.mViewHolder.textDollar.setText(String.format("%.2f", real / 4));
                this.mViewHolder.textEuro.setText(String.format("%.2f", real / 5));
            }
        }
    }

    /**
     * Limpa os valores iniciais
     */
    private void clearValues() {
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    /**
     * Padrão ViewHolder
     */
    private static class ViewHolder {
        private EditText editReal;
        private TextView textDollar;
        private TextView textEuro;
        private Button buttonCalculate;
    }
}