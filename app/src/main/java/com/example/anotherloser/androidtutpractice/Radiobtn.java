package com.example.anotherloser.androidtutpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radiobtn extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobtn);
        radioGroup =findViewById(R.id.r1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#ff0000"));
                        Toast.makeText(getApplicationContext(),"Hey its Red!!!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00ff00"));
                        Toast.makeText(getApplicationContext(),"Hey its Green!!!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000ff"));
                        Toast.makeText(getApplicationContext(),"Hey its Blue!!!",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
