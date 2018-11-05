package com.example.amanthakur.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mobileArray[] = {"Android", "Iphone", "Windows Phone", "Blackberry","webOS","Ubuntu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this,R.layout.activity_listview,mobileArray);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adpater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str =
                //Toast.makeText(MainActivity.this,getText(i).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
