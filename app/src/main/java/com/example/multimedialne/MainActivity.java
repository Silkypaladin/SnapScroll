package com.example.multimedialne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView cards;
    List<Integer> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cards = findViewById(R.id.cards);
        images = new ArrayList<>();

        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);
        images.add(R.drawable.valley_mini);

        adapter = new Adapter(this, images);

        GridLayoutManager manager = new GridLayoutManager(this,  2, GridLayoutManager.VERTICAL, false);
        cards.setLayoutManager(manager);
        cards.setAdapter(adapter);
    }

    public void loadImageActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String tag = (String) view.getTag();
        intent.putExtra("imgName", tag);
        startActivity(intent);
    }
}