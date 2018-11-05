package com.example.amanthakur.customalertdialogbox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showalertdialogboxwithlistview();
    }
    public void showalertdialogboxwithlistview(){
        List<String> mAnimals = new ArrayList<String>();
        mAnimals.add("CAT");
        mAnimals.add("DOG");
        mAnimals.add("HORSE");
        mAnimals.add("ELEPHANT");
        mAnimals.add("RAT");
        mAnimals.add("LION");

        //create sequence of items
        final CharSequence []Animals = mAnimals.toArray(new String[mAnimals.size()]);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("ANIMALS");
        alertDialogBuilder.setItems(Animals, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String selectedText = Animals[i].toString();
                Toast.makeText(MainActivity.this,selectedText.toString(),Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
