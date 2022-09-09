package com.example.shapesarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class rectangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle_activity);
        EditText rectangleHeight=findViewById(R.id.rectangle_height);
        EditText rectangleWidth=findViewById(R.id.rectangle_width);
        Button rectangleCalc = (findViewById(R.id.bt_calc_rectangle));
    }
}