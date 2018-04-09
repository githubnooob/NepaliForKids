package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class A_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<ItemModel> itemModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_);


        mRecyclerView = findViewById(R.id.recyclerViewA);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemModels = new ArrayList<>();

        itemModels.add(new ItemModel("A","B","C"));
        itemModels.add(new ItemModel("D","E","F"));
        itemModels.add(new ItemModel("G","H","I"));
        itemModels.add(new ItemModel("J","K","L"));
        itemModels.add(new ItemModel("M","N","O"));
        itemModels.add(new ItemModel("P","Q","R"));
        itemModels.add(new ItemModel("S","T","U"));
        itemModels.add(new ItemModel("V","W","X"));
        itemModels.add(new ItemModel("Y","Z",""));

        adapter = new LetterAdapter(itemModels,getApplicationContext());
        mRecyclerView.setAdapter(adapter);


    }
}
