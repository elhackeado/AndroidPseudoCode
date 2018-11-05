package com.example.amanthakur.progressdialogdemo;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Button button;
    private ProgressDialog progressBar;
    private int progressBarStatus;
    private Handler progressBarHandler = new Handler();
    private long fileSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar = new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("File Downloading...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                progressBarStatus = 0;
                fileSize = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressBarStatus<100){
                            progressBarStatus = downloadFile();
                            try{
                                sleep(1000);

                            }
                            catch (Exception e)
                            {
                                Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                            }
                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });
                        }

                        if(progressBarStatus>=100){
                            try{
                                Thread.sleep(2000);
                            }
                            catch (Exception e){
                                Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                            }
                            progressBar.dismiss();
                        }
                    }
                }).start();
            }
        });

    }

    public int downloadFile(){
        while (fileSize<=100000){
            fileSize++;
        }
        if (fileSize==100000){
            return 10;
        }
        else if (fileSize==200000){
            return 20;
        }
        else if(fileSize==300000){
            return 30;
        }
        else if (fileSize==400000){
            return 40;
        }
        else if(fileSize==500000){
            return 50;
        }
        else if (fileSize==600000){
            return 60;
        }
        else if(fileSize==700000){
            return 70;
        }
        else if (fileSize==800000){
            return 80;
        }
        else if(fileSize==900000){
            return 90;
        }

        return 100;

    }
}
