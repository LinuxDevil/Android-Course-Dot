package alimohammad.com.media;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer songPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//           File on Android Project
//      TODO:  Put your own file here!
//        Instead of song put your own file name here
//        How ? -.-
//        Put the file you want inside raw...
//        Then uncomment the song player

        //TODO: Uncomment this code after you follow the upper steps
//            songPlayer = MediaPlayer.create(this,R.raw.song);


        final SeekBar songSeekBar = findViewById(R.id.seekBar);
        songSeekBar.setMax(songPlayer.getDuration());
//            songPlayer.start();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                songSeekBar.setProgress(songPlayer.getCurrentPosition());
            }
        },0,1000);



        songSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                songPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                songPlayer.pause();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                songPlayer.start();
            }
        });




//    URL
        String url = "https://images.alarab.com/data/static/MMS_Files/MP3/mp3_files/Z/Zikra/Azab-ElHawa/Alarab_Zekra_Azab-Elhawa.mp3";
        MediaPlayer urlPlayer = new MediaPlayer();
        urlPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            urlPlayer.setDataSource(url);
            urlPlayer.prepare();
//            urlPlayer.start();
        } catch (Exception e){
            Log.v("MEDIA_ERROR", e.getLocalizedMessage());
        }


//        Video
        VideoView video = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);


        //TODO: put a video inside raw then uncomment the code below Ctrl+/
        //TODO: then put your own file name instead of g

        //TODO: From here
/*
        Uri videoUri = Uri.parse("android.resource://"
                + getPackageName() +
                "/" + R.raw.g);
        video.setVideoURI(videoUri);
        video.start();
*/

        //TODO: to Here









//        Button btn = findViewById(R.id.button);
//        btn.setOnClickListener(this);
//        video.setMediaController(mediaController);




        //        seekBar = findViewById(R.id.seekBar);
        //        seekBar.setMax(songPlayer.getDuration());
        //        seekBar.setProgress(songPlayer.getCurrentPosition());
        //        songPlayer.start();
        //        new Timer().schedule(new TimerTask() {
        //            @Override
        //            public void run() {
        //                seekBar.setProgress(songPlayer.getCurrentPosition()); }
        //        },0,1000);
        //
        //        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        //            @Override
        //            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        //                songPlayer.seekTo(i); }
        //            @Override
        //            public void onStartTrackingTouch(SeekBar seekBar) {
        //                songPlayer.pause();
        //            }
        //            @Override
        //            public void onStopTrackingTouch(SeekBar seekBar) {
        //                songPlayer.start();
        //            }
        //        });


    }

    public void play(View view) {
        songPlayer.start();
    }

    public void pause(View view) {
        songPlayer.pause();
    }
}
