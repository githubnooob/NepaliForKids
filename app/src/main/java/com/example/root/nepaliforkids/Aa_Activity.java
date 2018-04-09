package com.example.root.nepaliforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Aa_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa_);


        mRecyclerView = findViewById(R.id.recyclerViewAa);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemModels = new ArrayList<>();
        itemModels.add(new ItemModel("अ","आ","इ"));
        itemModels.add(new ItemModel("ई","उ","ऊ"));
        itemModels.add(new ItemModel("ए","ऐ","ओ"));
        itemModels.add(new ItemModel("औ","अं","अ:"));
        adapter = new LetterAdapter(itemModels,getApplicationContext());
        mRecyclerView.setAdapter(adapter);
    }
}
