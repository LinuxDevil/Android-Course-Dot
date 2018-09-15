package alimohammad.com.lecture10;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView animImage;
    Animation scale;
    Animation rotate;
    Animation translate;
    Animation alphaAnim;

//    Java Animations
    ScaleAnimation scaleAnim;
    RotateAnimation rotateAnim;
    TranslateAnimation translateAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.slide_out, R.anim.slide_in);

        animImage = findViewById(R.id.animationImage);
        animImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void scale(View view) {
//XML Animations
        //        scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        //        animImage.startAnimation(scale);
//    Java Animations
        scaleAnim = new ScaleAnimation(1,2,1
                ,2,0.5f,0.5f);
        scaleAnim.setDuration(2000);
        scaleAnim.setFillAfter(true);
        scaleAnim.setAnimationListener(this);
        animImage.startAnimation(scaleAnim);
    }


    public void playActivityAnimation(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void translate(View view) {
//        translate = AnimationUtils.loadAnimation(this, R.anim.translate);
//        animImage.startAnimation(translate);
////View Java Animation Code
//        translateAnimation = new TranslateAnimation(0,100,0,200);
//        translateAnimation.setDuration(2000);
//        translateAnimation.setFillAfter(true);
//        animImage.startAnimation(translateAnimation);

//        Task
        LinearLayout linearLayout = findViewById(R.id.linearAnim);
        Animator anim = AnimatorInflater.loadAnimator
                (this, R.animator.translate_animator);
        anim.setTarget(linearLayout);
        anim.start();


//        Properity Animation
//        Animator anim = AnimatorInflater.loadAnimator(this,R.animator.translate_animator);
//        anim.setTarget(animImage);
//        anim.start();
    }

    public void rotate(View view) {
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animImage.startAnimation(rotate);
    }

    public void alpha(View view) {
        alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        animImage.startAnimation(alphaAnim);
    }


// TO see when the animation start

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(this, "animation started", Toast.LENGTH_SHORT).show();

    }
// TO see when the animation end

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(this, "animation end", Toast.LENGTH_SHORT).show();

    }

    // TO see when the animation repeat

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(this, "animation repeat", Toast.LENGTH_SHORT).show();

    }
}
