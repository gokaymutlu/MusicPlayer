package com.proje1.muzikcaldirma;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch switchMuzik;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   switchMuzik= (Switch)findViewById(R.id.switch1);
    mediaPlayer=MediaPlayer.create(getApplicationContext() , R.raw.m1 );


   switchMuzik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
       @Override
       public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
           if(b)
               mediaPlayer.start();
           else
               mediaPlayer.pause();
       }
   });


    }


}