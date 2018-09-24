package alimohammad.com.lecture5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Talab extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talab);

        textView = findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().get("name").toString());

    }
}
