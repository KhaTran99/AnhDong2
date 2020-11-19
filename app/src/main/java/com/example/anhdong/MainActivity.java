package com.example.anhdong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnstart = findViewById(R.id.btnstart);
        Button btnstart2 = findViewById(R.id.btnstart2);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView image = (ImageView)findViewById(R.id.img1);
//                Animation animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
//                image.startAnimation(animFade);
                ImageView image = (ImageView)findViewById(R.id.img1);
                Animation animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                image.startAnimation(animFade);
            }
        });
        btnstart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img2 = findViewById(R.id.img2);

                Animation animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake2);
                img2.startAnimation(animFade);


                img2.setBackgroundResource(R.drawable.framebyframe);
                AnimationDrawable animationDrawable = (AnimationDrawable)img2.getBackground();
                animationDrawable.start();






            }
        });

    }
}