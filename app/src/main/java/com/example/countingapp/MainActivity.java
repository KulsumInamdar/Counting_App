package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mediaPlayer;
    public void onAudio(View view)
    {
        Button btClicked = (Button)view;
        //acc to the tag audio should be played
        mediaPlayer= MediaPlayer.create(this, getResources().getIdentifier
                (
                btClicked.getTag().toString(),
                "raw",
                getPackageName()
                )
        );
        mediaPlayer.start();
    }

    public  void onStop(View view)
    {
        if(mediaPlayer!=null)
        {
            mediaPlayer.stop();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}