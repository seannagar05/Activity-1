package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.activity1.R.color.red;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_green,button_reset,button_black,button_pink;
    View background_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_red = (Button) findViewById(R.id.btn_red);
        button_blue = (Button) findViewById(R.id.btn_blue);
        button_green = (Button) findViewById(R.id.btn_green);
        button_reset = (Button) findViewById(R.id.btn_reset);
        background_view = this.getWindow().getDecorView();
        button_black = (Button) findViewById(R.id.btn_black);
        button_pink = (Button) findViewById(R.id.btn_pink);


        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_red.getText().equals("Red")) {
                    background_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this, "You changed the background color to Red", Toast.LENGTH_LONG).show();
                }


            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_blue.getText().equals("Blue")){
                    background_view.setBackgroundResource(R.color.blue);
                    Toast.makeText( MainActivity.this, "You changed the background color to Blue",Toast.LENGTH_LONG).show();
                }
            }
        });
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_green.getText().equals("Green")){
                    background_view.setBackgroundResource(R.color.green);
                    Toast.makeText( MainActivity.this,"You changed the backgroynd color to green",Toast.LENGTH_LONG).show();
                }
            }
        });
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_reset.getText().equals("Reset")){
                    background_view.setBackgroundResource(R.color.white);
                    Toast.makeText( MainActivity.this, "You reset the background color",Toast.LENGTH_LONG).show();
                }
            }
        });
        button_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_black.getText().equals("Black")){
                    background_view.setBackgroundResource(R.color.black);
                    Toast.makeText( MainActivity.this, "You changed the background color to black",Toast.LENGTH_LONG).show();
            }
        }

        });

        button_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_pink.getText().equals("Pink")){
                    background_view.setBackgroundResource(R.color.pink);
                    Toast.makeText( MainActivity.this,"You changed the background color to pink",Toast.LENGTH_LONG).show();
                }
            }
        });


    }}

