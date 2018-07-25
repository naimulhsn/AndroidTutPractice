package com.example.anotherloser.androidtutpractice;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.concurrent.Delayed;

import static android.os.SystemClock.sleep;

public class ProgressBarr extends AppCompatActivity {
    ProgressBar progressBar;
    Button button;
    Handler handler=new Handler();
    int progressStatus=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_barr);
        progressBar=findViewById(R.id.progressBar);
        button=findViewById(R.id.btnoo);
    }

    public void prgress(View view){
        Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();
        button.setClickable(false);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<=100; i++){
                    progressStatus=i;
                    try {
                        sleep(20);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            String s="Progress : "+progressStatus;
                            button.setText(s);
                        }
                    });
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        button.setText("Buttton");
                        progressBar.setProgress(0);
                        button.setClickable(true);
                    }
                });
            }
        });
        thread.start();
    }
}
