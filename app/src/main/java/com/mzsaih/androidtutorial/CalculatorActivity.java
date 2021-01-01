package com.mzsaih.androidtutorial;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    String sResult;
    EditText risultatojs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        risultatojs = findViewById(R.id.risultato);
        sResult = "";

        /*Button zero_js = findViewById(R.id.zero);
        Button uno_js = findViewById(R.id.uno);
        Button due_js = findViewById(R.id.due);
        Button tre_js = findViewById(R.id.tre);
        Button quadtro_js = findViewById(R.id.quatro);
        Button cinque_js = findViewById(R.id.cinque);
        Button sei_js = findViewById(R.id.sei);
        Button sette_js = findViewById(R.id.sette);
        Button otto_js = findViewById(R.id.otto);
        Button nove_js = findViewById(R.id.nove);
        Button per_js = findViewById(R.id.per);
        Button piu_js = findViewById(R.id.piu);
        Button meno_js = findViewById(R.id.meno);
        Button diviso_js = findViewById(R.id.diviso);
        Button piuomeno_js = findViewById(R.id.piuomeno);
        Button percento_js = findViewById(R.id.per100);
        Button per2_js = findViewById(R.id.per2);
        Button offon_js = findViewById(R.id.onoff);
        Button uguale_js = findViewById(R.id.uguale);
        Button punto_js = findViewById(R.id.meno);*/
    }

    public void buttonClick(View view){
        Button btn = (Button) view;
        //Toast.makeText(CalculatorActivity.this,btn.getText(),Toast.LENGTH_SHORT).show();
        switch (btn.getText().toString()){
            case "1":
                sResult += "1";
                break;
            case "2":
                sResult += "2";
                break;
            case "3":
                sResult += "3";
                break;
            case "4":
                sResult += "4";
                break;
            case "5":
                sResult += "5";
                break;
            case "6":
                sResult += "6";
                break;
            case "7":
                sResult += "7";
                break;
            case "8":
                sResult += "8";
                break;
            case "9":
                sResult += "9";
                break;
            default:
                break;
        }
        risultatojs.setText(sResult);
    }
}