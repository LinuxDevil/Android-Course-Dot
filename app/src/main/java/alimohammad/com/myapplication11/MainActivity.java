package alimohammad.com.myapplication11;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    final int ACTION_PICK_KEY = 0;
    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bundle = new Bundle();
        }


        public void gooo(View view){
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            bundle.putString("name", "ali");
            i.putExtras(bundle);
            startActivity(i);
        }


//
//    public void gooo(View view) {
//        Intent i  = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        startActivityForResult(i, ACTION_PICK_KEY);
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ACTION_PICK_KEY && resultCode == RESULT_OK){
            Picasso.get().load(data.getData()).into(
                    (ImageView) findViewById(R.id.imageView));
        }
        
    }
}
