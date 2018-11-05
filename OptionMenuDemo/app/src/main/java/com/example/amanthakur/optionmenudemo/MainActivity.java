package com.example.amanthakur.optionmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuitem){
        switch (menuitem.getItemId()){
            case R.id.item1:{
                Toast.makeText(MainActivity.this,"Item1",Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.item2:{
                Toast.makeText(MainActivity.this,"Item2",Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.item3:{
                Toast.makeText(MainActivity.this,"Item1",Toast.LENGTH_LONG).show();
                return true;
            }
            default:
                return super.onOptionsItemSelected(menuitem);
        }
    }
}
