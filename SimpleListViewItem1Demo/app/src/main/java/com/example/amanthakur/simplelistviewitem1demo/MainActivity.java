package com.example.amanthakur.simplelistviewitem1demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list_view);
        MyArrayAdapter arrayAdapter;
        ArrayList<ListItem> list = new ArrayList<>();
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));
        list.add(new ListItem(R.mipmap.ic_launcher,"ITEM 1"));



        arrayAdapter = new MyArrayAdapter(this,list);
        listView.setAdapter(arrayAdapter);
    }
}
