package com.example.anotherloser.androidtutpractice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class FlipperAdepterr extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    private static final int[] IMAGES={R.drawable.ic_launcher_background,R.drawable.ic_meflatavater_svg_1,
            R.drawable.ic_pial_2,R.drawable.ic_sportsfestlogo1_svg};
    private static final String[] TEXTS={"Abel","Anik","Alim","Bakul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper_adepterr);
        AdapterOfFlipper adapterOfFlipper=new AdapterOfFlipper(this,IMAGES,TEXTS);
        adapterViewFlipper.setAdapter(adapterOfFlipper);
        adapterViewFlipper.setAutoStart(true);
    }


    private class AdapterOfFlipper extends BaseAdapter{
        Context ctx;
        int[] IMAGES;
        String[] TEXTS;
        LayoutInflater layoutInflater;

        public AdapterOfFlipper(Context context, int[] images, String[] texts){
            this.ctx=context;
            this.IMAGES=images;
            this.TEXTS=texts;
            layoutInflater=LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            return TEXTS.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view= layoutInflater.inflate(R.layout.flipper_items,null);
            TextView textView= view.findViewById(R.id.idFlipperText);
            ImageView imageView= view.findViewById(R.id.idFlipperImage);
            textView.setText(TEXTS[position]);
            imageView.setImageResource(IMAGES[position]);
            return view;
        }

    }
}
