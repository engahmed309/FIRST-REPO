package com.example.shapesarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class triangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle_activity);
        EditText triangleHeight=findViewById(R.id.triangle_height);
        EditText triangleBase=findViewById(R.id.triangle_base);
        Button triangleCalc = (findViewById(R.id.bt_calc_triangle));


    }
}