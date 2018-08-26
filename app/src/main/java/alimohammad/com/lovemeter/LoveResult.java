package alimohammad.com.lovemeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class LoveResult extends AppCompatActivity {

    TextView love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_result);

        setTitle("Love Results");


        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order());



        love = findViewById(R.id.love);

        int lovePresent = new Random().nextInt(100) + 1;

        love.setText("Your Love present is: " + String.valueOf(lovePresent) + "%");
    }

    public void back(View view){
        Intent i = new Intent (LoveResult.this, MainActivity.class);
        startActivity(i);
    }

}
