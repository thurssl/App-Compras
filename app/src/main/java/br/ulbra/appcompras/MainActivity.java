package br.ulbra.appcompras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkPICANHA, chkCARVAO, chkLENHA, chkCOSTELA;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chkPICANHA = (CheckBox) findViewById(R.id.chkPicanha);
        chkCARVAO= (CheckBox) findViewById(R.id.chkCarvao);
        chkLENHA = (CheckBox) findViewById(R.id.chkLenha);
        chkCOSTELA = (CheckBox) findViewById(R.id.chkCOSTELA);
        Button bttotal = (Button) findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkPICANHA.isChecked()) {
                    total += 36.90;
                }
                if (chkCARVAO.isChecked()) {
                    total += 5.69;
                }
                if (chkLENHA.isChecked()) {
                    total += 12.15;
                }
                if (chkCOSTELA.isChecked()) {
                    total += 30.50;
                }
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra :" + String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}