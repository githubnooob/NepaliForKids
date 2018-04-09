package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class EveryLetterActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_letter);
        imageView = findViewById(R.id.eachLetterImageView);

        Intent intent = getIntent();
        intent.getStringExtra("letterValue");
        int value = intent.getIntExtra("letterValue",20);
        String alpahbets = intent.getStringExtra("letterValue");

        switch (value)
        {
            case 0:
                break;
            case 1:
                imageView.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView.setImageResource(R.drawable.two);
                break;
            case 3:
                imageView.setImageResource(R.drawable.three);
                break;
            case 4:
                imageView.setImageResource(R.drawable.four);
                break;
            case 5:
                imageView.setImageResource(R.drawable.five);
                break;
            case 6:
                imageView.setImageResource(R.drawable.six);
                break;
            case 7:
                imageView.setImageResource(R.drawable.seven);
                break;
            case 8:
                imageView.setImageResource(R.drawable.eight);
                break;
            case 9:
                imageView.setImageResource(R.drawable.nine);
                break;
            case 10:
                imageView.setImageResource(R.drawable.ten);
                break;
            case 11:
            default:
                break;
        }


        switch (alpahbets)
        {
            case "A":
                imageView.setImageResource(R.drawable.a);
                break;
            case "B":
                imageView.setImageResource(R.drawable.b);
                break;
            case "C":
                imageView.setImageResource(R.drawable.c);
                break;
            case "D":
                imageView.setImageResource(R.drawable.d);
                break;
            case "E":
                imageView.setImageResource(R.drawable.e);
                break;
            case "F":
                imageView.setImageResource(R.drawable.f);
                break;
            case "G":
                imageView.setImageResource(R.drawable.g);
                break;
            case "H":
                imageView.setImageResource(R.drawable.h);
                break;
            case "I":
                imageView.setImageResource(R.drawable.i);
                break;
            case "J":
                imageView.setImageResource(R.drawable.j);
                break;
            case "K":
                imageView.setImageResource(R.drawable.k);
                break;
            case "L":
                imageView.setImageResource(R.drawable.l);
                break;
            case "M":
                imageView.setImageResource(R.drawable.m);
                break;
            case "N":
                imageView.setImageResource(R.drawable.n);
                break;
            case "O":
                imageView.setImageResource(R.drawable.o);
                break;
            case "P":
                imageView.setImageResource(R.drawable.p);
                break;
            case "Q":
                imageView.setImageResource(R.drawable.q);
                break;
            case "R":
                imageView.setImageResource(R.drawable.r);
                break;
            case "S":
                imageView.setImageResource(R.drawable.s);
                break;
            case "T":
                imageView.setImageResource(R.drawable.t);
                break;
            case "U":
                imageView.setImageResource(R.drawable.u);
                break;
            case "V":
                imageView.setImageResource(R.drawable.v);
                break;
            case "W":
                imageView.setImageResource(R.drawable.w);
                break;
            case "X":
                imageView.setImageResource(R.drawable.x);
                break;
            case "Y":
                imageView.setImageResource(R.drawable.y);
                break;
            case "Z":
                imageView.setImageResource(R.drawable.z);
                break;
            default:
                break;
        }



    }
}
