package com.example.amanthakur.simplelistviewitem1demo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<ListItem> {

    private Context mContext;
    private List<ListItem> listItems = new ArrayList<>();

    public MyArrayAdapter(@NonNull Context context, ArrayList<ListItem> list) {
        super(context,0, list);
        mContext = context;
        listItems = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;
        if(listItem==null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        ListItem currentItem = listItems.get(position);
        ImageView imageView = (ImageView)listItem.findViewById(R.id.imageview);
        imageView.setImageResource(currentItem.getmImageId());
        TextView textView = (TextView)listItem.findViewById(R.id.textview);
        textView.setText(currentItem.getmItem());
        return listItem;
    }

}
