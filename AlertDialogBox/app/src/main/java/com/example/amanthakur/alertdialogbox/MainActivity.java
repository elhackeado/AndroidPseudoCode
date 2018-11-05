package com.example.amanthakur.alertdialogbox;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);
                alertdialogbuilder.setTitle("Exit");
                alertdialogbuilder.setMessage("Are you sure you want to EXIT ?");
                alertdialogbuilder.setCancelable(false);
                alertdialogbuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });
                alertdialogbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    Intent activityChangeIntent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(activityChangeIntent);
                    }
                });

                AlertDialog alertDialog = alertdialogbuilder.create();
                alertDialog.show();;
            }
        });
    }
}
