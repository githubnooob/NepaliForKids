package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class One_Activity extends AppCompatActivity {
    private CardView letterOne;
    private CardView letterTwo;
    private CardView letterThree;
    private CardView letterFour;
    private CardView letterFive;
    private CardView letterSix;
    private CardView letterSeven;
    private CardView letterEight;
    private CardView letterNine;
    private CardView letterTen;
    private CardView letterZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_);

        letterOne = findViewById(R.id.one);
        letterTwo = findViewById(R.id.two);
        letterThree = findViewById(R.id.three);
        letterFour = findViewById(R.id.four);
        letterFive = findViewById(R.id.five);
        letterSix = findViewById(R.id.six);
        letterSeven = findViewById(R.id.seven);
        letterEight = findViewById(R.id.eight);
        letterNine = findViewById(R.id.nine);
        letterTen = findViewById(R.id.ten);
        letterZero = findViewById(R.id.zero);

        letterOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",1);
                startActivity(intent);
            }
        });

        letterTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",2);
                startActivity(intent);

            }
        });

        letterThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",3);
                startActivity(intent);
            }
        });

        letterFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",4);
                startActivity(intent);
            }
        });

        letterFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",5);
                startActivity(intent);
            }
        });

        letterSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",6);
                startActivity(intent);
            }
        });

        letterSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",7);
                startActivity(intent);
            }
        });

        letterEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",8);
                startActivity(intent);
            }
        });

        letterNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",9);
                startActivity(intent);
            }
        });

        letterTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",10);
                startActivity(intent);
            }
        });

        letterZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(One_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue",0);
                startActivity(intent);
            }
        });




    }
}
