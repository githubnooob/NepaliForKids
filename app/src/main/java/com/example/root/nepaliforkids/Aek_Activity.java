package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Aek_Activity extends AppCompatActivity {

    private CardView letterAek;
    private CardView letterDui;
    private CardView letterTin;
    private CardView letterChar;
    private CardView letterPanch;
    private CardView letterChha;
    private CardView letterSaat;
    private CardView letterAath;
    private CardView letterNau;
    private CardView letterDash;
    private CardView letterSunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aek_);


         letterAek= findViewById(R.id.aek);
         letterDui= findViewById(R.id.dui);
         letterTin= findViewById(R.id.tin);
         letterChar= findViewById(R.id.charr);
         letterPanch= findViewById(R.id.panch);
         letterChha= findViewById(R.id.chha);
         letterSaat= findViewById(R.id.saat);
         letterAath= findViewById(R.id.aath);
         letterNau= findViewById(R.id.nau);
         letterDash= findViewById(R.id.dash);
         letterSunna= findViewById(R.id.sunya);


        letterAek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","aek");
                startActivity(intent);
            }
        });

        letterDui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","dui");
                startActivity(intent);

            }
        });

        letterTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","tin");
                startActivity(intent);
            }
        });

        letterChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","char");
                startActivity(intent);
            }
        });

        letterPanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","panch");
                startActivity(intent);
            }
        });

        letterChha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","chha");
                startActivity(intent);
            }
        });

        letterSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","saat");
                startActivity(intent);
            }
        });

        letterAath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","aath");
                startActivity(intent);
            }
        });

        letterNau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","nau");
                startActivity(intent);
            }
        });

        letterDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","dash");
                startActivity(intent);
            }
        });

        letterSunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aek_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","sunna");
                startActivity(intent);
            }
        });


    }
}
