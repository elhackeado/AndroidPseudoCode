package com.example.amanthakur.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button button;
    RadioButton rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        button = (Button) findViewById(R.id.button);
        listener();
    }

    public void listener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected = rg.getCheckedRadioButtonId();
                rbutton = (RadioButton) findViewById(selected);
                Toast.makeText(getApplicationContext(),rbutton.getText(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
