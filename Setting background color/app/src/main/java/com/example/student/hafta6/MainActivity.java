package com.example.student.hafta6;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(myIntent);
            }
        });



    }

    @Override
    public void onResume(){
        super.onResume();
        OrtakClass ort = (OrtakClass)getApplicationContext();
        getWindow().getDecorView().setBackgroundColor(Color.rgb(ort.GetRed(),ort.GetGreen(),ort.GetBlue()));

    }
}
