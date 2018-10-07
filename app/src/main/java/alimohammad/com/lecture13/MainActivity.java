package alimohammad.com.lecture13;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteHelper dbHelper;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new SQLiteHelper(this);
        username = findViewById(R.id.usernameEditText);
        password = findViewById(R.id.passwordEditText);
    }

    public void insert(View view) {

        if(dbHelper.insertData(username.getText().toString(), password.getText().toString())){
            Toast.makeText(this, "انعمل انسيرت للداتا", Toast.LENGTH_SHORT).show();
            username.setText(""); password.setText("");
        }else {
            Toast.makeText(this, "ما انعمل انسيرت ايررور", Toast.LENGTH_SHORT).show();
        }

    }

    public void showData(View view) {

        if(dbHelper.getData().getCount() > 0){

            StringBuffer results = new StringBuffer();

            Cursor c = dbHelper.getData();

            while(c.moveToNext()){

                results.append("ID: " + c.getString(0) + "\n");
                results.append("Name: " + c.getString(1) + "\n");
                results.append("Password: " + c.getString(2) + "\n\n");
            }

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage(results.toString());
            dialog.setTitle("الداتا حبيبتنا");
            dialog.setCancelable(true);
            dialog.show();
        }else {
            Toast.makeText(this, "فش داتا", Toast.LENGTH_SHORT).show();
        }

    }
}
