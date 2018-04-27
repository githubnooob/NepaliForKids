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

        for (int i = 0; i<=11;i=i+3)
        {
            itemModels.add(new ItemModel(String.valueOf(i),String.valueOf(i+1),String.valueOf(i+2)));
        }



        adapter = new LetterAdapter(itemModels,this);
        mRecyclerView.setAdapter(adapter);



    }
}
