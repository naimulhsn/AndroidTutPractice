package com.example.anotherloser.androidtutpractice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {
    TextView welcmtxt;
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        welcmtxt=findViewById(R.id.welcomeText);
        Animation animationFadeIn= AnimationUtils.loadAnimation(this,R.anim.fadein);

        welcmtxt.startAnimation(animationFadeIn);

        final Intent i=new Intent(this,Home.class);

        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        thread.start();
    }
}
