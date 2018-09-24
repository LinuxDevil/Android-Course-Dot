package alimohammad.com.lecture12;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = findViewById(R.id.videoView);

//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(video);
        Uri videoUri = Uri.parse("android.resource://"
                + getPackageName() +
                "/" + R.raw.g);
        video.setVideoURI(videoUri);
        video.start();

//        Button btn = findViewById(R.id.button);
//        btn.setOnClickListener(this);
//        video.setMediaController(mediaController);




    }

    @Override
    public void onClick(View view) {

    }
}
