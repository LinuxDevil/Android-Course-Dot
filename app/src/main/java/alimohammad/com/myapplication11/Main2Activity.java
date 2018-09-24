package alimohammad.com.myapplication11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textView);

        Intent g = getIntent();
        Bundle b = g.getExtras();
        String name = b.getString("name");
        text.setText(name);

    }
}
