package com.mzsaih.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.Task;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvHello;
    EditText etName;
    Button btnHello;
    int sumVar;
    FloatingActionButton fab;

    ListView list;

    public static final String VARIABLE1 = "VAR1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get ListView From XML
        list = findViewById(R.id.list1);

        //DATA
        //Create cars list
        ArrayList<Car> carlist = new ArrayList<>();
        //Create first car
        Car car1 = new Car();
        car1.setMarque("Cadillac");
        car1.setHorsePower(300);

        Car car2 = new Car();
        car2.setMarque("Honda");
        car2.setHorsePower(240);

        Car car3 = new Car();
        car3.setMarque("GMC");
        car3.setHorsePower(540);

        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);

        CarAdapter adapter = new CarAdapter(MainActivity.this, carlist);
        list.setAdapter(adapter);






        /*tvHello  = findViewById(R.id.tv_hello);
        etName   = findViewById(R.id.et_name);
        btnHello = findViewById(R.id.btn_hello);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On click
                //tvHello.setText("hello "+etName.getText());
                Intent i = new Intent(MainActivity.this, CalculatorActivity.class);
                i.putExtra(VARIABLE1,"Valeur1");
                startActivity(i);
                //finish();
            }
        });
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/



    }
}