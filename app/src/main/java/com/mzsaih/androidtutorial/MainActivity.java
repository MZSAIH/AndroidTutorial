package com.mzsaih.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mzsaih.androidtutorial.data.Car;
import com.mzsaih.androidtutorial.data.Garage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvHello;
    EditText etName;
    Button btnHello;
    int sumVar;
    FloatingActionButton fab;
    ListView list;
    ArrayList<Car> carlist;

    FirebaseAnalytics fa;
    public static final String VARIABLE1 = "VAR1";
    private static final String TAG  = "CLASSES";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Car c1 = new Car("bmw",140,300);
        Car c2 = new Car(c1);
        Car c3 = new Car("Mercedes",250);
        Car c4 = new Car();

        Garage g = new Garage(105,"Hay charaf 2");

        g.addCars(0,c1);
        g.addCars(7,c3);
        Car[] cars = new Car[4];

        Log.d(TAG, g.getCars());


        /*fa = FirebaseAnalytics.getInstance(this);

        //get ListView From XML
        list = findViewById(R.id.list1);

        //Create cars list
        carlist = new ArrayList<>();
        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        db.child("cars").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                carlist.clear();
                Iterable<DataSnapshot> cars = snapshot.getChildren();
                for (DataSnapshot car: cars){
                    if (car.exists()) {
                        carlist.add(car.getValue(Car.class));
                    }
                }
                CarAdapter adapter = new CarAdapter(MainActivity.this, carlist);
                list.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"something went wrong"+error,Toast.LENGTH_LONG).show();
            }
        });

        tvHello  = findViewById(R.id.tv_hello);
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