package com.example.amanthakur.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
    private EditText editText1,editText2,editText3,editText4,editText5;
    private Button button;
    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = (TextView) findViewById(R.id.firstnameTV);
        textView2 = (TextView) findViewById(R.id.lastnameTV);
        textView3 = (TextView) findViewById(R.id.phoneTV);
        textView4 = (TextView) findViewById(R.id.chooseusernameTV);
        textView5 = (TextView) findViewById(R.id.choosepassTV);
        textView6 = (TextView) findViewById(R.id.vfirstnameTV);
        textView7 = (TextView) findViewById(R.id.vlastnameTV);
        textView8 = (TextView) findViewById(R.id.vphoneTV);
        textView9 = (TextView) findViewById(R.id.vchooseusernameTV);
        textView10 = (TextView) findViewById(R.id.vchoosepassTV);

        editText1 = (EditText) findViewById(R.id.firstnameET);
        editText2 = (EditText) findViewById(R.id.lastnameET);
        editText3 = (EditText) findViewById(R.id.phoneET);
        editText4 = (EditText) findViewById(R.id.chooseusernameET);
        editText5 = (EditText) findViewById(R.id.choosepassET);
        rg        = (RadioGroup) findViewById(R.id.radiogroup);

        button = (Button) findViewById(R.id.signupB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView6.setText("FIRST NAME: "     + editText1.getText().toString().trim());
                textView7.setText("LAST NAME: "      + editText2.getText().toString().trim());
                textView8.setText("PHONE NO.: "      + editText3.getText().toString().trim());
                textView9.setText("USERNAME: "       + editText4.getText().toString().trim());
                textView10.setText("PASSWORD: "      + editText5.getText().toString().trim());
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                editText5.setText("");

            }
        });

    }
}
