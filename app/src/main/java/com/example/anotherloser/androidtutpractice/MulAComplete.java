package com.example.anotherloser.androidtutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MulAComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul_acomplete);
        String[] names={"Abel","Anik","Alim","Bakul","Bolod","Bawal" ,"Badal","Barek","Chyanu","Dengu"
                ,"Emu","Puter","Tempu","Alom","Pagla","Pagli","Yeasiro","Robert"};
        MultiAutoCompleteTextView multiAutoCompleteTextView=findViewById(R.id.idMulAComplete);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
