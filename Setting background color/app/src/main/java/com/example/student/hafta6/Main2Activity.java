package com.example.student.hafta6;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    SeekBar sb1,sb2,sb3;
    int red=0,blue=0,green=0;  // bütün renkleri güncellemek için tutulan count değerleri

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sb1 = (SeekBar) findViewById(R.id.sb_red);
        sb2 = (SeekBar) findViewById(R.id.sb_green);
        sb3 = (SeekBar) findViewById(R.id.sb_blue);

        sb1.setProgress(((OrtakClass)Main2Activity.this.getApplication()).GetRed());   //seekbar progress değerleri alınıyor ortakclasstan
        sb2.setProgress(((OrtakClass)Main2Activity.this.getApplication()).GetGreen());
        sb3.setProgress(((OrtakClass)Main2Activity.this.getApplication()).GetBlue());

        OrtakClass ort = (OrtakClass)getApplicationContext();
        getWindow().getDecorView().setBackgroundColor(Color.rgb(ort.GetRed(),ort.GetGreen(),ort.GetBlue()));

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                ((OrtakClass)Main2Activity.this.getApplication()).Red(i);
                red = i;
                getWindow().getDecorView().setBackgroundColor(Color.rgb(i,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                ((OrtakClass)Main2Activity.this.getApplication()).Green(i);
                green = i;
                getWindow().getDecorView().setBackgroundColor(Color.rgb(red,i,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                ((OrtakClass)Main2Activity.this.getApplication()).Blue(i);
                blue = i;
                getWindow().getDecorView().setBackgroundColor(Color.rgb(red,green,i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        //hepsi birden update oluyor renklerin

        ((OrtakClass)Main2Activity.this.getApplication()).Blue(blue);
        ((OrtakClass)Main2Activity.this.getApplication()).Green(green);
        ((OrtakClass)Main2Activity.this.getApplication()).Red(red);


    }

}
