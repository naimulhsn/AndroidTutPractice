package com.example.anotherloser.androidtutpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class TextSwitch extends AppCompatActivity {
    TextSwitcher textSwitcher;
    Button btnPrev,btnNext;
    private static final String[] TEXTS={"Abel","Anik","Alim","Bakul","Bolod","Bawal" ,"Badal","Barek","Chyanu","Dengu"
            ,"Emu","Puter","Tempu","Alom","Pagla","Pagli","Yeasiro","Robert"};
    private int mPos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_switch);
        textSwitcher= findViewById(R.id.txtswitch);
        btnNext=findViewById(R.id.btnNext);
        btnPrev=findViewById(R.id.btnPrev);

        final Animation inleft= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        final Animation outright= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        final Animation inright= AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        final Animation outleft= AnimationUtils.loadAnimation(this,R.anim.slide_out_left);


        textSwitcher.setFactory(new ViewSwitcher.ViewFactory(){
            @Override
            public View makeView(){
                TextView textView=new TextView(getApplicationContext());
                textView.setTextSize(18);
                textView.setGravity(Gravity.CENTER_HORIZONTAL);
                textView.setTextColor(Color.parseColor("#000fff"));
                return textView;
            }
        });
        textSwitcher.setCurrentText("Click the buttons bellow");
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSwitcher.setInAnimation(inright);
                textSwitcher.setOutAnimation(outleft);
                textSwitcher.setText(TEXTS[mPos]);
                mPos++;
                if(mPos>17)mPos=0;
                //Toast.makeText(getApplicationContext(),"next",Toast.LENGTH_SHORT).show();
            }
        });
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSwitcher.setInAnimation(inleft);
                textSwitcher.setOutAnimation(outright);
                textSwitcher.setText(TEXTS[mPos]);
                mPos--;
                if(mPos<0)mPos=17;
                //Toast.makeText(getApplicationContext(),"prev",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
