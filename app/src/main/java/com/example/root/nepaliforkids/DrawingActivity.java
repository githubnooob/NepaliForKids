package com.example.root.nepaliforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrawingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawingCanvaClass(this,null));
    }
}
