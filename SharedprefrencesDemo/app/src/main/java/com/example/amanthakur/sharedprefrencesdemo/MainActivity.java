package com.example.amanthakur.sharedprefrencesdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    EditText ed,ed2,ed3;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        bt = (Button) findViewById(R.id.button);
        sharedPreferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed.getText().toString();
                String phone = ed2.getText().toString();
                String email = ed3.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Name",name);
                editor.putString("Phone",phone);
                editor.putString("Email",email);
                editor.commit();
                Toast.makeText(MainActivity.this,"THANKS",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}
