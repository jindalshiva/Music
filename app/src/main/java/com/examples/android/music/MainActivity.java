package com.examples.android.music;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button button = (Button) findViewById (R.id.play);
        Button button1 = (Button) findViewById (R.id.pause);

        final MediaPlayer mediaPlayer = MediaPlayer.create (this,R.raw.hello);

        button.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                mediaPlayer.start ();
                mediaPlayer.setOnCompletionListener (new MediaPlayer.OnCompletionListener ( ) {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText (getApplicationContext (),"I am done",Toast.LENGTH_LONG).show ();
                    }
                });


            }
        });
        button1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause ();
            }
        });


    }
}
