package com.example.amanthakur.sharedprefrencesdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView tv4,tv5,tv6;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);
        bt = (Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
                tv4.setText(sharedPreferences.getString("Name",null));
                tv5.setText(sharedPreferences.getString("Phone",null));
                tv6.setText((sharedPreferences.getString("Email",null)));
                Toast.makeText(Main2Activity.this,"DONE",Toast.LENGTH_LONG).show();
            }
        });

    }
}
