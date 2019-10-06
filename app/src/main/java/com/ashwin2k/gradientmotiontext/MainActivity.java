package com.ashwin2k.gradientmotiontext;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vw=findViewById(R.id.vw);
        vw.setVideoPath("android.resource://" + getPackageName() + "/"
                + R.raw.vp);
        vw.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        vw.start();
        Log.d("VID",vw.isPlaying()+"");
        vw.resume();
    }
}
