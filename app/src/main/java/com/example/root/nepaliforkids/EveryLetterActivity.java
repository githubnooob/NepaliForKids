package com.example.root.nepaliforkids;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class EveryLetterActivity extends AppCompatActivity {
    private TextView letterView;
    private Button clearButton;
    private TextToSpeech speakLetters;
    private String get_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_letter);
        letterView = findViewById(R.id.letterText);
        clearButton = findViewById(R.id.clearButton);



        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DrawingCanvaClass.path.reset();
            }
        });


        Intent intent = getIntent();
        String letters = intent.getStringExtra("letterValue");
        get_sound = letters;
        switch (letters)
        {
            case "0":
                letterView.setText(letters);
            case "1":
                 letterView.setText(letters);
                break;
            case "2":
                 letterView.setText(letters);
                break;
            case "3":
                 letterView.setText(letters);
                break;
            case "4":
                 letterView.setText(letters);
                break;
            case "5":
                 letterView.setText(letters);
                break;
            case "6":
                 letterView.setText(letters);
                break;
            case "7":
                 letterView.setText(letters);
                break;
            case "8":
                 letterView.setText(letters);
                break;
            case "9":
                 letterView.setText(letters);
                break;

            case "A":
                 letterView.setText(letters);
                break;
            case "B":
                 letterView.setText(letters);
                break;
            case "C":
                 letterView.setText(letters);
                break;
            case "D":
                 letterView.setText(letters);
                break;
            case "E":
                 letterView.setText(letters);
                break;
            case "F":
                 letterView.setText(letters);
                break;
            case "G":
                 letterView.setText(letters);
                break;
            case "H":
                 letterView.setText(letters);
                break;
            case "I":
                 letterView.setText(letters);
                break;
            case "J":
                 letterView.setText(letters);
                break;
            case "K":
                 letterView.setText(letters);
                break;
            case "L":
                 letterView.setText(letters);
                break;
            case "M":
                 letterView.setText(letters);
                break;
            case "N":
                 letterView.setText(letters);
                break;
            case "O":
                 letterView.setText(letters);
                break;
            case "P":
                 letterView.setText(letters);
                break;
            case "Q":
                 letterView.setText(letters);
                break;
            case "R":
                 letterView.setText(letters);
                break;
            case "S":
                 letterView.setText(letters);
                break;
            case "T":
                 letterView.setText(letters);
                break;
            case "U":
                 letterView.setText(letters);
                break;
            case "V":
                 letterView.setText(letters);
                break;
            case "W":
                 letterView.setText(letters);
                break;
            case "X":
                 letterView.setText(letters);
                break;
            case "Y":
                 letterView.setText(letters);
                break;
            case "Z":
                 letterView.setText(letters);
                break;
            case "क":
                letterView.setText(letters);
                break;
            case "ख":

                letterView.setText(letters);
                break;
            case "ग":

                letterView.setText(letters);
                break;
            case "घ":

                letterView.setText(letters);
                break;
            case "ङ":

                letterView.setText(letters);
                break;
            case "च":

                letterView.setText(letters);
                break;
            case "छ":

                letterView.setText(letters);
                break;
            case "ज":

                letterView.setText(letters);
                break;
            case "झ":

                letterView.setText(letters);
                break;
            case "ञ":

                letterView.setText(letters);
                break;
            case "ट":

                letterView.setText(letters);
                break;

            case "ठ":

                letterView.setText(letters);
                break;
            case "ड":

                letterView.setText(letters);
                break;
            case "ढ":

                letterView.setText(letters);
                break;
            case "ण":

                letterView.setText(letters);
                break;
            case "त":

                letterView.setText(letters);
                break;
            case "थ":

                letterView.setText(letters);
                break;
            case "द":

                letterView.setText(letters);
                break;
            case "ध":

                letterView.setText(letters);
                break;
            case "न":

                letterView.setText(letters);
                break;
            case "प":

                letterView.setText(letters);
                break;
            case "फ":

                letterView.setText(letters);
                break;
            case "ब":

                letterView.setText(letters);
                break;
            case "भ":

                letterView.setText(letters);
                break;
            case "म":

                letterView.setText(letters);
                break;
            case "य":

                letterView.setText(letters);
                break;
            case "र":

                letterView.setText(letters);
                break;
            case "ल":

                letterView.setText(letters);
                break;
            case "व":

                letterView.setText(letters);
                break;
            case "श":

                letterView.setText(letters);
                break;
            case "ष":

                letterView.setText(letters);
                break;
            case "स":

                letterView.setText(letters);
                break;
            case "ह":

                letterView.setText(letters);
                break;
            case "क्ष":

                letterView.setText(letters);
                break;
            case "त्र":

                letterView.setText(letters);
                break;
            case "ज्ञ":

                letterView.setText(letters);
                break;

            case "अ":

                letterView.setText(letters);
                break;
            case "आ":

                letterView.setText(letters);
                break;
            case "इ":

                letterView.setText(letters);
                break;
            case "ई":

                letterView.setText(letters);
                break;
            case "उ":

                letterView.setText(letters);
                break;
            case "ऊ":

                letterView.setText(letters);
                break;
            case "ए":

                letterView.setText(letters);
                break;
            case "ऐ":

                letterView.setText(letters);
                break;
            case "ओ":

                letterView.setText(letters);
                break;
            case "औ":

                letterView.setText(letters);
                break;
            case "अं":

                letterView.setText(letters);
                break;

            case "अ:":
                letterView.setText(letters);
                break;

            case "०":
                letterView.setText(letters);
                break;
            case "१":

                letterView.setText(letters);
                break;
            case "२":

                letterView.setText(letters);
                break;
            case "३":

                letterView.setText(letters);
                break;
            case "४":

                letterView.setText(letters);
                break;
            case "५":

                letterView.setText(letters);
                break;
            case "६":

                letterView.setText(letters);
                break;
            case "७":

                letterView.setText(letters);
                break;
            case "८":

                letterView.setText(letters);
                break;
            case "९":

                letterView.setText(letters);
                break;



            default:

                break;
        }



    }

    @Override
    protected void onPause() {
        if(speakLetters !=null){
            speakLetters.stop();
            speakLetters.shutdown();
            speakLetters = null;
        }
        super.onPause();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.every_letter_menu_items,menu);
        return true;
    }

    @Override
    protected void onResume() {

        speakLetters =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    speakLetters.setLanguage(Locale.UK);
                }
            }
        });

        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.make_sound:
                makeSound();
        }

        return true;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void makeSound() {
        if (get_sound.matches("[A-Za-z0-9]+")) {
            Log.e("Checking Sound", get_sound);
            speakLetters.speak(get_sound, TextToSpeech.QUEUE_FLUSH, null);
        }
    }
}
