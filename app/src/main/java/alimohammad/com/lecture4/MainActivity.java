package alimohammad.com.lecture4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Spinner spinn;
    ToggleButton toggleBut;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.layout);
        toggleBut = findViewById(R.id.toggle);
        
        toggleBut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "It's On!", Toast.LENGTH_SHORT).show();
                    linear.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "It's Off", Toast.LENGTH_SHORT).show();
                    linear.setVisibility(View.GONE);
                }
            }
        });

//        spinn = findViewById(R.id.spinner);
//        spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "Item Selected index is: " + spinn.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

    }
}
