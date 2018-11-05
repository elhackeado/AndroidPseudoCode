package com.example.amanthakur.arduinosms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(5*1000);
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(SplashScreen.this,e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        };
        background.start();
    }
}