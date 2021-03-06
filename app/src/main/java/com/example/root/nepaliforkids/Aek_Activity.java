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

public class Aek_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<ItemModel> itemModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aek_);


        mRecyclerView = findViewById(R.id.recyclerViewAek);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemModels = new ArrayList<>();

        itemModels.add(new ItemModel("०","१","२"));
        itemModels.add(new ItemModel("३","४","५"));
        itemModels.add(new ItemModel("६","७","८"));
        itemModels.add(new ItemModel("९","",""));

        adapter = new LetterAdapter(itemModels,this);
        mRecyclerView.setAdapter(adapter);


    }
}
