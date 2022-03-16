package com.example.ui_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.btn1_msg,   Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2= findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.btn2_msg,   Toast.LENGTH_SHORT).show();
            }
        });

        Button btn3= findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.btn3_msg,   Toast.LENGTH_SHORT).show();
            }
        });

        Button btn4= findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn1.getText()=="Button1")
                    btn1.setText("Button One");
                else
                    btn1.setText("Button1");
            }
        });

        Button btn5= findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(flag==true) {
                    LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                    layout.setGravity(Gravity.CENTER_HORIZONTAL);
                    flag=false;
                }
                else
                {
                    LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                    layout.setGravity(Gravity.NO_GRAVITY);
                    flag=true;
                }
            }
        });

        Button btn6= findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                layout.setPadding(20,20,20,20);
            }
        });
    }
    boolean flag = true;
}