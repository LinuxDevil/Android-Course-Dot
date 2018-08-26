package alimohammad.com.lovemeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout after, before;
    TextView love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        after = findViewById(R.id.layout_after);
        before = findViewById(R.id.layout_before);
//        love = findViewById(R.id.love);

    }

    public void calculate(View view){


        Intent intent = new Intent(MainActivity.this, LoveResult.class);
        startActivity(intent);

        //        before.setVisibility(View.GONE);
//

//        after.setVisibility(View.VISIBLE);
    }

//    public void back(View view){
//        after.setVisibility(View.GONE);
//        before.setVisibility(View.VISIBLE);
//    }
}
