package com.robo.voice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    public static int SPLASH_SCREEN = 8000;

    Animation topanim, Bottomanim, floating;
    ImageView image;
    TextView text, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topanim = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        Bottomanim = AnimationUtils.loadAnimation(this, R.anim.pro_animation);
        floating = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        image = (ImageView) findViewById(R.id.logo);
        // slogan=(TextView)findViewById(R.id.slogan);
        text = (TextView) findViewById(R.id.logo_text);

        image.setAnimation(topanim);

        text.setAnimation(Bottomanim);
        //text2.setAnimation(floating);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, SpalshScreen.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}