package com.example.amanthakur.sumoftwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
     public void addListenerOnButton(){
        editText1 = (EditText) findViewById(R.id.edittext1);
        editText2 = (EditText) findViewById(R.id.edittext2);
        buttonSum = (Button) findViewById(R.id.button1);
         buttonSum.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int value1 = Integer.parseInt(editText1.getText().toString());
                 int value2 = Integer.parseInt(editText2.getText().toString());
                 String sum = String.valueOf(value1+value2);
                 Toast.makeText(getApplicationContext(),sum, Toast.LENGTH_LONG).show();

             }
         });

     }
}
