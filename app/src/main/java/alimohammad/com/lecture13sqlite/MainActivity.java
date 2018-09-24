package alimohammad.com.lecture13sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.sqlData);

         db = this.openOrCreateDatabase("NOTESs",
                MODE_PRIVATE,null);

        String createTable = "CREATE TABLE IF NOT EXISTS" +
                " userInfo (name VARCHAR, age INTEGER(3), id INTEGER PRIMARY KEY AUTOINCREMENT)";

        db.execSQL(createTable);

//        Cursor c = db.rawQuery("SELECT * FROM userInfo"
//                ,null);
//
//        int nameCol = c.getColumnIndex("name");
//        int ageCol = c.getColumnIndex("age");
//
//        c.moveToFirst();
//        while(c != null){
//
//            Log.v("SQLITE-Name:", c.getString(nameCol));
//            Log.d("SQLITE-AGE: ",
//                    Integer.toString(c.getInt(ageCol)));
//
//            c.moveToNext();
//        }

    }


    public void insertData(View view) {
        String insertData = "INSERT INTO userInfo (name,age) VALUES('ali','20')";
        db.execSQL(insertData);
    }

    public void showData(View view) {
        Cursor c = db.rawQuery("SELECT * FROM userInfo", null);
        c.moveToFirst();
        do{
           resultText.setText(
                   c.getString(c.getColumnIndex("name"))
           );
           Log.v("SQLITE_DATA Name: " , c.getString(c.getColumnIndex("name")));
           Log.v("SQLITE_DATA AGE: " , Integer.toString(c.getInt(c.getColumnIndex("age"))));
           Log.v("SQLITE_DATA ID: " , Integer.toString(c.getInt(c.getColumnIndex("id"))));
        }while(c.moveToNext());


    }
}
