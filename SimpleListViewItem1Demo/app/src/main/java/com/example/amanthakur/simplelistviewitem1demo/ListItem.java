package com.example.amanthakur.simplelistviewitem1demo;

public class ListItem {

    private int mImageId;
    private String mItem;

    public ListItem(int mImageId, String mItem){
        this.mImageId = mImageId;
        this.mItem = mItem;
    }

    public void setmImageId(int mImageId){
        this.mImageId = mImageId;
    }
    public int getmImageId(){
        return mImageId;
    }
    public void setmItem(String mItem){
        this.mItem = mItem;
    }

    public String getmItem() {
        return mItem;
    }
}
