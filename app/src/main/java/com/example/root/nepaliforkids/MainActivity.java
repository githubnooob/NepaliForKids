package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardViewForA;
    private CardView cardViewForKa;
    private CardView cardViewForAa;
    private CardView cardViewForOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewForA = (CardView) findViewById(R.id.cardViewForA);
        cardViewForKa = (CardView) findViewById(R.id.cardViewForKa);
        cardViewForOne = (CardView) findViewById(R.id.cardViewForOne);
        cardViewForAa = (CardView) findViewById(R.id.cardViewForAa);

        cardViewForA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,A_Activity.class);
                startActivity(intent);
            }
        });

        cardViewForA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,A_Activity.class);
                startActivity(intent);
            }
        });

        cardViewForAa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Aa_Activity.class);
                startActivity(intent);
            }
        });

        cardViewForKa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DrawingActivity.class);
                startActivity(intent);
            }
        });

        cardViewForOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,One_Activity.class);
                startActivity(intent);
            }
        });





    }
}
