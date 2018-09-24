package alimohammad.com.lecture7;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       text1 = findViewById(R.id.userText);

        SharedPreferences.Editor sharedPreferences =
                getSharedPreferences("notes", MODE_PRIVATE)
                        .edit();
        sharedPreferences.putString("note1", "Hi All!").apply();
        sharedPreferences.commit();


        if(getSharedPreferences("notes",MODE_PRIVATE)
            .getString("note1", "none").equals("none")){

            text1.setText("none!");

        }else {
            text1.setText(getSharedPreferences("notes", MODE_PRIVATE)
            .getString("note1","none"));
        }

    }
}