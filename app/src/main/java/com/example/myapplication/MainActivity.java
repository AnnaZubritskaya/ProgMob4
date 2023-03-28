package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4_var6);

        GridView gridView = (GridView)findViewById(R.id.gridview);
        MyAdapter adapter=new MyAdapter(this);
        gridView.setAdapter(adapter);
    }
}