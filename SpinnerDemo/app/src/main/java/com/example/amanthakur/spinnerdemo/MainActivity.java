package com.example.amanthakur.spinnerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        List<String> categories= new ArrayList<String>();
        categories.add("AUTOMOBILE");
        categories.add("BUSINESS SERVICES");
        categories.add("COMPUTER");
        categories.add("EDUCATION");
        categories.add("PERSONAL");
        categories.add("TRAVEL");

        //CREATING ADAPTER FOR SPINNER

        ArrayAdapter<String> dataadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);
        dataadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataadapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();

                Toast.makeText(adapterView.getContext(),"Selected: " + item, Toast.LENGTH_LONG).show();


                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
