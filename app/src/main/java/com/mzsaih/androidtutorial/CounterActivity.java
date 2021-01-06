package com.mzsaih.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {
    int mCounter;
    TextView tvCounter;

    char Operation;
    int reslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        //initialisation
        tvCounter = findViewById(R.id.txtcount);
        mCounter = 0;
    }

















    public void countUp(View view){
        mCounter++;
        Toast.makeText(CounterActivity.this,Integer.toString(mCounter),Toast.LENGTH_SHORT).show();
        if (tvCounter != null)
            tvCounter.setText(Integer.toString(mCounter));
    }
}