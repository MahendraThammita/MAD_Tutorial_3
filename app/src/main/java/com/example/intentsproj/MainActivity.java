package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    EditText inNum1 , inNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.buttonOk);
        inNum1 = findViewById(R.id.actOneNum1);
        inNum2 = findViewById(R.id.actOneNum2);

        LayoutInflater layin = getLayoutInflater();
        View layout = layin.inflate(R.layout.custom_toast , (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast editToast =new Toast(getApplicationContext());
        editToast.setDuration(Toast.LENGTH_SHORT);
        editToast.setGravity(Gravity.CENTER_VERTICAL , 0 , 0);
        editToast.setView(layout);
        editToast.show();

        final Context cont = getApplicationContext();
        final Intent toNext = new Intent(cont , SecondActivity.class);
        toNext.putExtra("VAL_NO1" , inNum1.getText());
        toNext.putExtra("VAL_NO2" , inNum2.getText());

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                CharSequence msg = "Yoy just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast showMsg = Toast.makeText(cont , msg , duration);
                showMsg.setGravity(Gravity.TOP|Gravity.LEFT , 20 , 100);
                showMsg.show();

                startActivity(toNext);
            }
        });


    }
}