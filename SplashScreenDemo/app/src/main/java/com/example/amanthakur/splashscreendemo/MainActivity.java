package com.example.amanthakur.splashscreendemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(5*1000);

                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        };
        background.start();

    }
}
