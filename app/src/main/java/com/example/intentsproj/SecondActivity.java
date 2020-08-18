package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button add, sub , divide , multi;
    EditText no1Show , no2Show;
    TextView showCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.buttonADD);
        sub = findViewById(R.id.buttonSUB);
        divide = findViewById(R.id.buttonDIVIDE);
        multi = findViewById(R.id.buttonMULTI);
        no1Show = findViewById(R.id.no1DispArea);
        no2Show = findViewById(R.id.no2DispArea);
        showCalc = findViewById(R.id.showCalc);

        Intent recieverIntent = getIntent();
        no1Show.setText(String.valueOf(recieverIntent.getIntExtra("VAL_NO1" , 0)));
        no2Show.setText(String.valueOf(recieverIntent.getIntExtra("VAL_NO2" , 0)));
    }
}