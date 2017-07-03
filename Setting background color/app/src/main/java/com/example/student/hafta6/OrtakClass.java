package com.example.student.hafta6;

import android.app.Application;
import android.widget.SeekBar;

/**
 * Created by Student on 29.03.2017.
 */
public class OrtakClass extends Application {

    int blue,red,green;


    public int Blue(int a) {

        blue = a;

        return blue;
    }

    public int Red(int a) {

        red = a;
        return red;
    }

    public int Green(int a) {

        green = a;
        return green;
    }

    public int GetBlue() {

        return blue;
    }

    public int GetGreen() {

        return green;
    }

    public int GetRed() {

        return red;
    }




}
