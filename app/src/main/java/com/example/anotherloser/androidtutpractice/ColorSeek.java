package com.example.anotherloser.androidtutpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ColorSeek extends AppCompatActivity {
    TextView textView;
    SeekBar seekred,seekgreen,seekblue;
    String c1="00",c2="00",c3="00";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_seek);
        textView=findViewById(R.id.textView);
        seekred=findViewById(R.id.red);
        seekgreen=findViewById(R.id.green);
        seekblue=findViewById(R.id.blue);
        seekred.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                c1 = Hex(progress);
                SetColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekgreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                c2 = Hex(progress);
                SetColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekblue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                c3 = Hex(progress);
                SetColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    public String Hex(int i){
        String s;
        int a=i/16;
        int b=i%16;
        if(a<10)s=""+a;
        else{
            char c= (char) (55+a);
            s=""+c;
        }
        if(b<10)s=s+b;
        else{
            char c= (char) (55+b);
            s=s+c;
        }
        return s;
    }
    private void SetColor(){
        String colorCode="#"+c1+c2+c3;
        textView.setText(colorCode);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor(colorCode));
    }
}