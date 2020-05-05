package com.example.awais.happy_birth_day;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Awais Ehsan on 12/20/2018.
 */

public class Services extends Service {

    MediaPlayer Player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Player=MediaPlayer.create(this, R.raw.birth);
        Player.setLooping(true);
        Player.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Player.stop();
    }
}
