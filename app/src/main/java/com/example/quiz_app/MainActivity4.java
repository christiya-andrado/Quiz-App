package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
ImageButton nxt2,pr2;
 RadioButton o21,o22,o23,o24,sans;
public static int marks = MainActivity3.marks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main4);

        nxt2=(ImageButton) findViewById(R.id.next2);
        pr2=(ImageButton) findViewById(R.id.pre2);
        o21=(RadioButton) findViewById(R.id.rb1);
        o22=(RadioButton) findViewById(R.id.rb2);
        o23=(RadioButton) findViewById(R.id.rb3);
        o24=(RadioButton) findViewById(R.id.rb4);

        String user=getIntent().getStringExtra("name");


        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(o21.isChecked())
                {
                    marks = marks + 1;
                    sans=o21;
                }
                else if(o21.isChecked())
                {
                    marks = marks + 0;
                    sans=o21;
                }
                else if(o23.isChecked())
                {
                    marks=marks+0;
                    sans=o23;
                }
                else {
                    marks = marks + 0;
                    sans=o24;
                }

                if (!o21.isChecked() && !o22.isChecked() && !o23.isChecked() && !o24.isChecked()) {
                    Toast.makeText(MainActivity4.this, "Please Select the Answer...!", Toast.LENGTH_LONG).show();
                } else {
                    Intent Int = new Intent(MainActivity4.this, MainActivity5.class);
                    Int.putExtra("name", user);
                    startActivity(Int);


                }
            }
        });
        pr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Int = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(Int);
            }
        });

    }
}