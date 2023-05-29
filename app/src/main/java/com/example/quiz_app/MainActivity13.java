package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
TextView txt,check;
ImageView img;

    public static int marks = MainActivity12.marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main13);

        txt=(TextView) findViewById(R.id.name);
        check=(TextView) findViewById(R.id.marks);
        img=(ImageView) findViewById(R.id.img);

        String user=getIntent().getStringExtra("name");
        check.setText("You got "+Integer.toString(marks)+"out of 10");
        txt.setText("Hello, "+user);

        if(marks==0)
        {
            img.setImageResource(R.drawable.marks0);
        }
        else if(marks<5)
        {
            img.setImageResource(R.drawable.sad2);
        }
        else {
            img.setImageResource(R.drawable.clap);
        }
        Button exitButton = findViewById(R.id.home);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });


    }
}