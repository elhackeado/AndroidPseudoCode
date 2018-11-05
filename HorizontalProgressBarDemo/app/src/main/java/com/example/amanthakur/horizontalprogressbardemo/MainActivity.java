package com.example.amanthakur.horizontalprogressbardemo;

import android.app.ProgressDialog;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download(view);
            }
        });
    }

    public void download(View view){
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Downloading Music...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(false);
        progressDialog.setProgress(0);
        progressDialog.show();

        final int totalProgressTime = 100;
        final Thread t = new Thread(){
            @Override
            public void run(){
                int jumptime = 0;

                while (jumptime<totalProgressTime){
                    try{
                        sleep(200);
                        jumptime+=5;
                        progressDialog.setProgress(jumptime);

                    }
                    catch (Exception e){
                        Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                    }
                }
                progressDialog.dismiss();
            }
        };
        t.start();
    }
}
