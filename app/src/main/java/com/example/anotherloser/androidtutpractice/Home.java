package com.example.anotherloser.androidtutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;

public class Home extends AppCompatActivity {
    Button p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        p1=(Button)findViewById(R.id.p1);
    }

    public void OpenP(View view) {
        Intent i=new Intent(getApplicationContext(),SeekBarr.class);
        startActivity(i);
    }
    public void OpenP1(View view) {
        Intent i1=new Intent(getApplicationContext(),Radiobtn.class);
        startActivity(i1);
    }
    public void OpenP2(View view) {
        Intent i2=new Intent(getApplicationContext(),ColorSeek.class);
        startActivity(i2);
    }
    public void OpenP3(View view) {
        Intent i3=new Intent(getApplicationContext(),RatingBarr.class);
        startActivity(i3);
    }
    public void OpenP4(View view) {
        Intent i4=new Intent(getApplicationContext(),ProgressBarr.class);
        startActivity(i4);
    }
    public void OpenP5(View view) {
        Intent i5=new Intent(getApplicationContext(),Spinnerr.class);
        startActivity(i5);
    }
    public void OpenP6(View view) {
        Intent i6=new Intent(getApplicationContext(),SwitchToggle.class);
        startActivity(i6);
    }
    public void OpenP7(View view) {
        Intent i7=new Intent(getApplicationContext(),ACompleteT.class);
        startActivity(i7);
    }
    public void OpenP8(View view) {
        Intent i8=new Intent(getApplicationContext(),MulAComplete.class);
        startActivity(i8);
    }
    public void OpenP9(View view) {
        Intent i9=new Intent(getApplicationContext(),SplashScreen.class);
        startActivity(i9);
    }
    public void OpenP10(View view) {
        Intent i10=new Intent(getApplicationContext(),TextSwitch.class);
        startActivity(i10);
    }
    public void OpenP11(View view) {
        Intent i11=new Intent(getApplicationContext(),ImageSwitcherr.class);
        startActivity(i11);
    }
    public void OpenP12(View view) {
        Intent i12=new Intent(getApplicationContext(),FlipperAdepterr.class);
        startActivity(i12);
    }
    public void OpenP13(View view) {
        Intent i13=new Intent(getApplicationContext(),CircleImage.class);
        startActivity(i13);
    }

}
