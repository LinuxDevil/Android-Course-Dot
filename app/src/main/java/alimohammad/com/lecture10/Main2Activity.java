package alimohammad.com.lecture10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        To Play animation on this activity
        overridePendingTransition(R.anim.slide_out, R.anim.slide_in);

    }
}
