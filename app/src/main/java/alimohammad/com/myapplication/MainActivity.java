package alimohammad.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }


    public void login(View view){

        if(username.getText().toString() != null
                && !password.getText().toString().isEmpty()) {

            String userString = username.getText().toString();
            String passString = password.getText().toString();


            if (userString.equals("hussam") && passString.equals("123456")) {
                Toast.makeText(getApplicationContext()
                        , "Login Successfully!",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
            }
        }

    }

}
