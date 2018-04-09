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

public class One_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_);

        mRecyclerView = findViewById(R.id.recyclerViewOne);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemModels = new ArrayList<>();

        itemModels.add(new ItemModel("0","1","2"));
        itemModels.add(new ItemModel("3","4","5"));
        itemModels.add(new ItemModel("6","7","8"));
        itemModels.add(new ItemModel("9","",""));

        adapter = new LetterAdapter(itemModels,getApplicationContext());
        mRecyclerView.setAdapter(adapter);



    }
}
