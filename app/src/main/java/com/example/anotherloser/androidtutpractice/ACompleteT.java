package com.example.anotherloser.androidtutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ACompleteT extends AppCompatActivity {
    protected AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acomplete_t);
        autoCompleteTextView=findViewById(R.id.idAutoCom);
        String[] names={"Abel","Anik","Alim","Bakul","Bolod","Bawal" ,"Badal","Barek","Chyanu","Dengu"
                ,"Emu","Puter","Tempu","Alom","Pagla","Pagli","Yeasiro","Robert"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        autoCompleteTextView.setAdapter(adapter);

    }
}
