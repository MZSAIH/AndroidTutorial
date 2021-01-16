package com.mzsaih.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.mzsaih.androidtutorial.data.Car;


public class TestClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_class);

        Car car1 = new Car("BMW",140,220);

        String m = car1.getMarque();



        Toast.makeText(TestClassActivity.this, m ,Toast.LENGTH_LONG).show();

    }
}