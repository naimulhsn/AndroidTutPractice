package com.example.anotherloser.androidtutpractice;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitcherr extends AppCompatActivity {
    private Button btnNext,btnPrev;
    private static final int[] IMAGES={};
    private static final int count=IMAGES.length;
    ImageSwitcher imageSwitcher;
    private int mPos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcherr);

        final Animation inleft= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        final Animation outright= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        final Animation inright= AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        final Animation outleft= AnimationUtils.loadAnimation(this,R.anim.slide_out_left);

        btnNext=findViewById(R.id.btnNext);
        btnPrev=findViewById(R.id.btnPrev);

        imageSwitcher=findViewById(R.id.imgSwitch);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSwitcher.setInAnimation(inright);
                imageSwitcher.setOutAnimation(outleft);
                imageSwitcher.setBackgroundResource(IMAGES[mPos]);
                mPos++;
                if(mPos>17)mPos=0;
                //Toast.makeText(getApplicationContext(),"next",Toast.LENGTH_SHORT).show();
            }
        });
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSwitcher.setInAnimation(inleft);
                imageSwitcher.setOutAnimation(outright);
                imageSwitcher.setBackgroundResource(IMAGES[mPos]);
                mPos--;
                if(mPos<0)mPos=17;
                //Toast.makeText(getApplicationContext(),"prev",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
