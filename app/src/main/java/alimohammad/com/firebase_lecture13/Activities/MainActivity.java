package alimohammad.com.firebase_lecture13.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import alimohammad.com.firebase_lecture13.Modals.User;
import alimohammad.com.firebase_lecture13.R;


//conquer001


public class MainActivity extends AppCompatActivity {

    FirebaseDatabase fireDB = FirebaseDatabase.getInstance();
    DatabaseReference fireRef;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    EditText email, password;
    TextView errorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.username);
        password = findViewById(R.id.password);
        errorTextView = findViewById(R.id.errorTextView);

        fireRef = fireDB.getReference("Users");


        fireRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                User addedUser = dataSnapshot.getValue(User.class);
                Toast.makeText(MainActivity.this, "new Child added: " + addedUser.getUsername(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Toast.makeText(MainActivity.this, "Child Changed", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Toast.makeText(MainActivity.this, "Child removed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                Toast.makeText(MainActivity.this, "Child moved ", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Child cancelled!", Toast.LENGTH_SHORT).show();
            }
        });

//
//        fireRef.child(aliUser.getUsername()).setValue(aliUser).addOnCompleteListener(
//                new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                Toast.makeText(MainActivity.this, "Task Successfull",
//                        Toast.LENGTH_SHORT).show();
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(MainActivity.this, e.getLocalizedMessage(),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    public void addNewChild(View view) {


        User aliUser = new User("alim", "123456", "",
                new Date().toString());

        aliUser.setUsername(aliUser.getUsername() + new Date().toString());

        fireRef.child(aliUser.getUsername()).setValue(aliUser).addOnCompleteListener(
                new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(MainActivity.this, "Task Successfull",
                                Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, e.getLocalizedMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void signUp(View view) {
        auth.createUserWithEmailAndPassword(
                email.getText().toString(),
                password.getText().toString()
        ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                errorTextView.setText(e.getLocalizedMessage());
            }
        });
    }


    public void login(View view){
        auth.signInWithEmailAndPassword(email.getText().toString(),
                password.getText().toString()).addOnFailureListener(
                new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        errorTextView.setText(e.getLocalizedMessage());
                    }
                }

        ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                errorTextView.setText("Login Successful");

            }
        });

        Intent i = new Intent(this, Messages.class);
        startActivity(i);

    }

}