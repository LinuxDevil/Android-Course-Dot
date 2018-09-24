package alimohammad.com.lecture5;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


//CheckBox check;
//EditText t1,t2;
//RelativeLayout relativeLayout;
RadioButton button, button2;
//RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

//button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//    @Override
//    public void onCheckedChanged(CompoundButton compoundButton,
//                                 boolean b) {
//
//    }
//});


//        group = findViewById(R.id.group);
        button = findViewById(R.id.radioButton3);
//        button2 = findViewById(R.id.radioButton2);

//        button = (RadioButton) group.getChildAt(1);

        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Intent i = new Intent(MainActivity.this, Talab.class);
                    i.putExtra("name", "ali");
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                }else {
                    Intent i = new Intent(MainActivity.this, Talab.class);
                    i.putExtra("name", "xyzz");
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                }
            }
        });
//        button2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b){
//                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });











//
//relativeLayout=findViewById(R.id.rr);
//t1=findViewById(R.id.tt);
//t2=findViewById(R.id.ttt);
//        check = findViewById(R.id.checkBox);
//        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b)
//                    relativeLayout.setVisibility(View.VISIBLE);
//            }
//        });
    }}
//        textView = findViewById(R.id.textView);
//
//        if(check.isChecked()){
//            Toast.makeText(getApplicationContext(),
//                    "Checked", Toast.LENGTH_LONG).show();
//        }else if(!check.isChecked()){
//            Toast.makeText(getApplicationContext(), "Not Checked", Toast.LENGTH_SHORT).show();
//        }
//
//
//        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b){
//                    textView.setText("Is Checked");
//                }else {
//                    textView.setText("Not Checked");
//                }
//            }
//        });


//        listView = findViewById(R.id.listView);
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Ali");
//        names.add("Ghassan");
//        names.add("Mohammad");
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext()
//                ,android.R.layout.simple_list_item_1,
//                names);
//
//        listView.setAdapter(adapter);
/*check = findViewById(R.id.checkBox);
textView =findViewById(R.id.textView);

textView.setTextColor(Color.parseColor("#B0B0B0"));

        if(check.isChecked()){
            Toast.makeText(getApplicationContext(),
                    "Checked", Toast.LENGTH_LONG).show();
        }else if(!check.isChecked()){
            Toast.makeText(getApplicationContext(), "Not Checked", Toast.LENGTH_SHORT).show();
        }
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if (b) {
                   textView.setText("Is Checked");
                   textView.setTextColor(Color.parseColor("#FF0000"));

               } else {
                   textView.setText("Not Checked");
                   textView.setTextColor(Color.parseColor("#B0B0B0"));
               }
           }
    });
    }


*/


