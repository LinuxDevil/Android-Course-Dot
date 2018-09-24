package alimohammad.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView text;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        et = findViewById(R.id.editText);
        text.setText("Hi");

        Log.v("A",text.getText().toString());

    }

    public void run(View view){
        Toast.makeText(this,"?Hi", Toast.LENGTH_SHORT ).show();


        text.setText( et.getText().toString() );


    }

}
