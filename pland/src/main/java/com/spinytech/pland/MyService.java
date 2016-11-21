package com.spinytech.pland;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.spinytech.musiclib.Music;

public class MyService extends Service {
    public Music music;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        music = new Music(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String command = intent.getStringExtra("command");
        if("play".equals(command)){
            music.play();
        }else if("stop".equals(command)){
            music.stop();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
