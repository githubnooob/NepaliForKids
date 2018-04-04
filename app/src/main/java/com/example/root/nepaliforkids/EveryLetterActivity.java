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
        imageView = findViewById(R.id.letterPic);

        Intent intent = getIntent();
        intent.getStringExtra("letterValue");
        int value = intent.getIntExtra("letterValue",20);
        Log.e("Checking", String.valueOf(value));
        switch (value)
        {
            case 0:
                break;
            case 1:
                imageView.setImageResource(R.mipmap.one);
                break;
            case 2:
                imageView.setImageResource(R.mipmap.two);
                break;
            case 3:
                imageView.setImageResource(R.mipmap.three);
                break;
            case 4:
                imageView.setImageResource(R.mipmap.four);
                break;
            case 5:
                imageView.setImageResource(R.mipmap.five);
                break;
            case 6:
                imageView.setImageResource(R.mipmap.six);
                break;
            case 7:
                imageView.setImageResource(R.mipmap.seven);
                break;
            case 8:
                imageView.setImageResource(R.mipmap.eight);
                break;
            case 9:
                imageView.setImageResource(R.mipmap.nine);
                break;
            case 10:
                imageView.setImageResource(R.mipmap.ten);
                break;
            default:
                break;
        }

    }
}
