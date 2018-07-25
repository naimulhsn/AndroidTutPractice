package com.example.anotherloser.androidtutpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchToggle extends AppCompatActivity {
    protected Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_toggle);
        aSwitch=findViewById(R.id.idswitch);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(getApplicationContext(),"Toggled On",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Toggled Off",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
