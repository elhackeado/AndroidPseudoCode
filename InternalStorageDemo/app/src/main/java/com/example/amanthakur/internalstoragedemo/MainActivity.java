package com.example.amanthakur.internalstoragedemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText1.getText().toString();
                String file = editText2.getText().toString();
                FileOutputStream fos;
                try{
                    fos = openFileOutput(file, Context.MODE_PRIVATE);
                    fos.write(name.getBytes());
                    fos.close();
                    Toast.makeText(getApplicationContext(),file+ " Saved",Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error"+ e.toString(),Toast.LENGTH_LONG).show();

                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename = editText2.getText().toString();
                StringBuffer stringBuffer = new StringBuffer();
                try{
                    BufferedReader br = new BufferedReader(new InputStreamReader(openFileInput(filename)));
                    String inputString;
                    while((inputString = br.readLine())!=null){
                        stringBuffer.append(inputString+"\n");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"ERROR: " + e.toString(),Toast.LENGTH_LONG).show();
                }

                Toast.makeText(MainActivity.this,stringBuffer,Toast.LENGTH_LONG).show();
            }
        });
    }
}
