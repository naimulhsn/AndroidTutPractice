package com.example.anotherloser.androidtutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarr extends AppCompatActivity {
    RatingBar ratingBar;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_barr);
        ratingBar=findViewById(R.id.rating);
        text=findViewById(R.id.text);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String s="Rating is "+rating;
                text.setText(s);
            }
        });

    }
}
