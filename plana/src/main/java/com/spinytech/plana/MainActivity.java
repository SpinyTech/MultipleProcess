package com.spinytech.plana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.spinytech.musiclib.Music;

public class MainActivity extends AppCompatActivity {

    Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = new Music(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.play();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.stop();
            }
        });
    }
}
