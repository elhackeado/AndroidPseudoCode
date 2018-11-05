package com.example.amanthakur.autocompleteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;



public class MainActivity extends AppCompatActivity {


    String language[] = {"C", "C++", "Java", ".NET", "Iphone", "ASP.NET", "Angular JS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, language);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(-65536);
    }

}