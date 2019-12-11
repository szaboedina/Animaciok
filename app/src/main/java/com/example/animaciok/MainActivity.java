package com.example.animaciok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView lottieAnimationView;
    private TextView textView;
    private Button buttonAnimation;
    private Animation bounce, fade_in, fade_out, rotate, zoom_in, zoom_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonAnimation = findViewById(R.id.buttonAnimation);

        bounce = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
        fade_in = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
        rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        zoom_in = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
        zoom_out = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_out);

        buttonAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView.startAnimation(bounce);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
            }
        });

    }
}
