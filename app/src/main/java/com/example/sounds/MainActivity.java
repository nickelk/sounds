package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView cat, dog;
    private MediaPlayer catSound, dogSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (ImageView)findViewById(R.id.cat);
        dog = (ImageView)findViewById(R.id.dog);

        catSound = MediaPlayer.create(this, R.raw.meowing);
        dogSound = MediaPlayer.create(this, R.raw.barking);

        imageClick();
    }

    public void imageClick(){
        cat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay(catSound);
                    }
                }
        );

        dog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay(dogSound);
                    }
                }
        );
    }

    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
}