package com.example.trupti.samplemplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv=(ImageView)findViewById(R.id.img1);
        final Button bn=(Button)findViewById(R.id.button);

        final MediaPlayer mp= MediaPlayer.create(MainActivity.this,R.raw.abc);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp.isPlaying() == true)
                {
                    bn.setBackgroundResource(R.drawable.stop);
                    mp.pause();
                }
                else
                {
                    bn.setBackgroundResource(R.drawable.start);
                    mp.start();
                }
            }
        });
    }
}
