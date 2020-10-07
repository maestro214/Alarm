package com.example.projectone;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    TextView logotext;
    ImageView logoimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);
        logoimage = findViewById(R.id.logoimage);
        logotext = findViewById(R.id.logotext);

        Animation logo = AnimationUtils.loadAnimation(this,R.anim.logo);
        Animation text = AnimationUtils.loadAnimation(this,R.anim.text);
        logoimage.startAnimation(logo);

        logotext.startAnimation(text);


        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN); getWindow().setStatusBarColor(Color.TRANSPARENT);



        text.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);

                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);


            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });


    }
    }


