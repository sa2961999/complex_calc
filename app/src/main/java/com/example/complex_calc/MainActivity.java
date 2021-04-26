package com.example.complex_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt_clear,bt_brac,bt_equal,bt_point,bt_or,bt_sum,bt_sub,bt_mul,bt_dev,bt_percent;
        TextView tv1;
        final TextView[] tv2 = new TextView[1];
        bt0 = findViewById(R.id.bt0);                bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);                bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);                bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);                bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);                bt9 = findViewById(R.id.bt9);
        bt_clear = findViewById(R.id.bt_clear);      bt_point = findViewById(R.id.bt_point);
        bt_percent = findViewById(R.id.bt_percent);  bt_brac = findViewById(R.id.bt_brac);
        bt_equal = findViewById(R.id.bt_equal);      bt_or = findViewById(R.id.bt_or);
        bt_mul = findViewById(R.id.bt_mul);          bt_dev = findViewById(R.id.bt_dev);
        bt_sum = findViewById(R.id.bt_sum);          bt_sub = findViewById(R.id.bt_sub);
        tv1=findViewById(R.id.tv1);                  tv1=findViewById(R.id.tv1);
        TextView finalTv = tv1;
         boolean add,sub,mul,dev;
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"9");
            }
        });
        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+".");
            }
        });

        bt_brac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalTv.setText(finalTv.getText().toString()+"()");

            }
        });

    }
}