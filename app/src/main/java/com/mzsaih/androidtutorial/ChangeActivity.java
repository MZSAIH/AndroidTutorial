package com.mzsaih.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChangeActivity extends AppCompatActivity {
    String url = "https://l9a.org/latest.json";
    ProgressDialog dialog;
    TextView tvEuro2Mad, tvEuro2Usd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        tvEuro2Mad = findViewById(R.id.EURO2MAD);
        tvEuro2Usd = findViewById(R.id.EURO2USD);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading....");
        dialog.show();

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String string) {
                parseJsonData(string);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(getApplicationContext(), "Some error occurred!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        RequestQueue rQueue = Volley.newRequestQueue(ChangeActivity.this);
        rQueue.add(request);

    }

    void parseJsonData(String jsonString) {
        try {

            JSONObject jsonObject = new JSONObject(jsonString);



            String status = jsonObject.getString("status");
            JSONArray data = jsonObject.getJSONArray("data");




            jsonObject = jsonObject.getJSONObject("rates");
            Double  MAD = jsonObject.getDouble("MAD");
            String  USD = jsonObject.getString ("USD");
            tvEuro2Mad.setText("1 EURO = "+ MAD + "MAD");
            tvEuro2Usd.setText("1 EURO = "+ USD + "$");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        dialog.dismiss();
    }
}
