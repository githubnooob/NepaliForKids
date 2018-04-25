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

public class Ka_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ka_);

        mRecyclerView = findViewById(R.id.recyclerViewKa);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemModels = new ArrayList<>();
        itemModels.add(new ItemModel("क","ख","ग"));
        itemModels.add(new ItemModel("घ","ङ","च"));
        itemModels.add(new ItemModel("छ","ज","झ"));
        itemModels.add(new ItemModel("ञ","ट","ठ"));
        itemModels.add(new ItemModel("ड","ढ","ण"));
        itemModels.add(new ItemModel("त","थ","द"));
        itemModels.add(new ItemModel("ध","न","प"));
        itemModels.add(new ItemModel("फ","ब","भ"));
        itemModels.add(new ItemModel("म","य","र"));
        itemModels.add(new ItemModel("ल","व","श"));
        itemModels.add(new ItemModel("ष","स","ह"));
        itemModels.add(new ItemModel("क्ष","त्र","ज्ञ"));


        adapter = new LetterAdapter(itemModels,this);

        mRecyclerView.setAdapter(adapter);


    }
}
