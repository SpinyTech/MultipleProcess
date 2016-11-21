package com.spinytech.planb;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.spinytech.musiclib.Music;

public class MyService extends Service {
    public static MyService instance;
    public Music music;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        music = new Music(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
