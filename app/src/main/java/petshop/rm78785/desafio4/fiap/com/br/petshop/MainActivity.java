package petshop.rm78785.desafio4.fiap.com.br.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGroup;
    CheckBox ckBoxFemea;
    CheckBox ckBoxAdestrado;
    CheckBox ckBoxVacinas;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGroup = (RadioGroup) findViewById(R.id.rdGrp);
        txtView = (TextView) findViewById(R.id.txtValor);
        ckBoxFemea = (CheckBox) findViewById(R.id.ck_femea);
        ckBoxAdestrado = (CheckBox) findViewById(R.id.ck_adestrado);
        ckBoxVacinas = (CheckBox) findViewById(R.id.ck_vacinas);

    }

    public void calcular(View v) {
        double valor = 0;
        double soma = 0;
        int idRadio = rdGroup.getCheckedRadioButtonId();
        if (idRadio == R.id.bCollie) {
            valor = 800.00;
            txtView.setText("R$ " + valor);
        } else if (idRadio == R.id.pit_bull) {
            valor = 750.00;
            txtView.setText("R$ " + valor);
        } else if (idRadio == R.id.pastoralemao) {
            valor = 700.00;
            txtView.setText("R$ " + valor);
        } else if (idRadio == R.id.pastorcanadense) {
            valor = 800.00;
            txtView.setText("R$ " + valor);
        } else {
            valor = 00.00;
            txtView.setText("R$ " + valor);
        }

        if (ckBoxFemea.isChecked()) {
            soma = 180.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if (ckBoxAdestrado.isChecked()) {
            soma = 400.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if (ckBoxVacinas.isChecked()) {
            soma = 200.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

        if (ckBoxFemea.isChecked() == false && ckBoxAdestrado.isChecked() == false && ckBoxVacinas.isChecked() == false) {
            soma = 0;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

    }
}
