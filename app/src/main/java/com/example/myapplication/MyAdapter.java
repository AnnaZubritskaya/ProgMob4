package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class MyAdapter extends BaseAdapter {

    private Context mycontext;

    Integer[] pictures={
            R.drawable.cat,
            R.drawable.raccoon,
            R.drawable.cat2,
            R.drawable.cat3,
            R.drawable.raccoon_2,
            R.drawable.cat4
    } ;

    public MyAdapter(Context p)
    {
        mycontext=p;
    }

    public int getCount() {
        return pictures.length;
    }

    public Object getItem(int index) {
        return pictures[index];
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int index, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mycontext);

        imageView.setImageResource(pictures[index]);
        imageView.setPadding(10,10,10,10);
        imageView.setLayoutParams(new GridView.LayoutParams(301, 418));
        return imageView;
    }
}