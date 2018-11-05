package com.example.amanthakur.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView1,textView2;
    private EditText editText1,editText2;
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.usernameTV);
        textView2 = (TextView) findViewById(R.id.passwordTV);
        editText1 = (EditText) findViewById(R.id.usernameET);
        editText2 = (EditText) findViewById(R.id.passwordET);
        button1 = (Button) findViewById(R.id.signinB);
        button2 = (Button) findViewById(R.id.registerB);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText1.getText().toString().trim();
                String password = editText2.getText().toString().trim();
                if(username.equals("aman") && password.equals("thakur")){
                    Toast.makeText(getApplicationContext(),"Logged In",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid USERNAME/PASSWORD",Toast.LENGTH_LONG).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
