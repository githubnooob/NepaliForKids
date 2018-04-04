package com.example.root.nepaliforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Ka_Activity extends AppCompatActivity {

    private CardView letterKa;
    private CardView letterKha;
    private CardView letterGa;
    private CardView letterGha;
    private CardView letterNga;
    private CardView letterCha;
    private CardView letterChha;
    private CardView letterJa;
    private CardView letterJha;
    private CardView letterYaa;
    private CardView letterTa;
    private CardView letterTha;
    private CardView letterDa;
    private CardView letterDhaa;
    private CardView letterUda;
    private CardView letterTaa;
    private CardView letterThaa;
    private CardView letterDaa;
    private CardView letterDhaaa;
    private CardView letterNaa;
    private CardView letterPa;
    private CardView letterFa;
    private CardView letterBa;
    private CardView letterVa;
    private CardView letterMa;
    private CardView letterYa;
    private CardView letterRa;
    private CardView letterLa;
    private CardView letterO;
    private CardView letterSa;
    private CardView letterSha;
    private CardView letterShaa;
    private CardView letterHa;
    private CardView letterKsh;
    private CardView letterTra;
    private CardView letterGya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ka_);

        letterKa = findViewById(R.id.BigLetterKa);
        letterKha  = findViewById(R.id.BigLetterKha);
        letterGa= findViewById(R.id.BigLetterGa);
        letterGha= findViewById(R.id.BigLetterGha);
        letterNga= findViewById(R.id.BigLetterNga);
        letterCha= findViewById(R.id.BigLetterCha);
        letterChha= findViewById(R.id.BigLetterChha);
        letterJa= findViewById(R.id.BigLetterJa);
        letterJha= findViewById(R.id.BigLetterjha);
        letterYaa= findViewById(R.id.BigLetterYa);
        letterTa= findViewById(R.id.BigLetterTa);
        letterTha= findViewById(R.id.BigLetterTha);
        letterDa= findViewById(R.id.BigLetterDa);
        letterDhaa= findViewById(R.id.BigLetterDha);
        letterUda= findViewById(R.id.BigLetteruda);
        letterTaa= findViewById(R.id.BigLetterTaa);
        letterThaa= findViewById(R.id.BigLetterThaa);
        letterDaa= findViewById(R.id.BigLetterDaa);
        letterDhaa= findViewById(R.id.BigLetterDhaa);
        letterNaa= findViewById(R.id.BigLetterNaa);
        letterPa= findViewById(R.id.BigLetterPa);
        letterFa= findViewById(R.id.BigLetterPha);
        letterBa= findViewById(R.id.BigLetterBa);
        letterVa= findViewById(R.id.BigLetterBha);
        letterMa= findViewById(R.id.BigLetterMa);
        letterYa= findViewById(R.id.BigLetterYa);
        letterRa= findViewById(R.id.BigLetterRa);
        letterLa= findViewById(R.id.BigLetterLa);
        letterO= findViewById(R.id.BigLetterWa);
        letterSa= findViewById(R.id.BigLetterSa);
        letterSha= findViewById(R.id.BigLetterShaa);
        letterShaa= findViewById(R.id.BigLetterShaaa);
        letterHa= findViewById(R.id.BigLetterHa);
        letterKsh= findViewById(R.id.BigLetterKsh);
        letterTra= findViewById(R.id.BigLetterTra);
        letterGya= findViewById(R.id.BigLetterGya);



        letterKa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","ka");
                startActivity(intent);

            }
        });
        letterKha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","kha");
                startActivity(intent);
            }
        });
        letterGa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ga");
                startActivity(intent);
            }
        });
        letterGha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Gha");
                startActivity(intent);
            }
        });
        letterNga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Nga");
                startActivity(intent);
            }
        });
        letterCha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Cha");
                startActivity(intent);
            }
        });
        letterChha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Chha");
                startActivity(intent);
            }
        });
        letterJa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ja");
                startActivity(intent);
            }
        });
        letterJha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Jha");
                startActivity(intent);
            }
        });
        letterYaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ya");
                startActivity(intent);
            }
        });
        letterTa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ta");
                startActivity(intent);
            }
        });
        letterTha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Tha");
                startActivity(intent);
            }
        });
        letterDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Da");
                startActivity(intent);
            }
        });
        letterDhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Dhaa");
                startActivity(intent);
            }
        });
        letterUda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Uda");
                startActivity(intent);
            }
        });
        letterTaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Taa");
                startActivity(intent);
            }
        });
        letterThaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Thaa");
                startActivity(intent);
            }
        });
        letterDaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Daa");
                startActivity(intent);
            }
        });
        letterDhaaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Dhaa");
                startActivity(intent);
            }
        });
        letterNaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Naa");
                startActivity(intent);
            }
        });
        letterPa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Pa");
                startActivity(intent);
            }
        });
        letterFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Fa");
                startActivity(intent);
            }
        });
        letterBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ba");
                startActivity(intent);
            }
        });
        letterVa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Bha");
                startActivity(intent);
            }
        });
        letterMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ma");
                startActivity(intent);
            }
        });
        letterYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ya");
                startActivity(intent);
            }
        });
        letterRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ra");
                startActivity(intent);
            }
        });
        letterLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","La");
                startActivity(intent);
            }
        });
        letterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Wa");
                startActivity(intent);
            }
        });
        letterSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Sa");
                startActivity(intent);
            }
        });
        letterSha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Kha");
                startActivity(intent);
            }
        });
        letterShaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Shaa");
                startActivity(intent);
            }
        });
        letterHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ha");
                startActivity(intent);
            }
        });
        letterKsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Ksh");
                startActivity(intent);
            }
        });
        letterTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Tra");
                startActivity(intent);
            }
        });
        letterGya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ka_Activity.this,EveryLetterActivity.class);
                intent.putExtra("letterValue","Gya");
                startActivity(intent);
            }
        });






    }
}
