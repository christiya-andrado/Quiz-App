package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity12 extends AppCompatActivity {
ImageButton nxt10,pr10;
    RadioButton o1,o2,o3,o4;
    public static int marks = MainActivity11.marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main12);

        nxt10=(ImageButton) findViewById(R.id.next10);
        pr10=findViewById(R.id.pre10);
        o1=(RadioButton) findViewById(R.id.rb1);
        o2=(RadioButton) findViewById(R.id.rb2);
        o3=(RadioButton) findViewById(R.id.rb3);
        o4=(RadioButton) findViewById(R.id.rb4);
        String user=getIntent().getStringExtra("name");

        nxt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((o1.isChecked() || o2.isChecked() || o4.isChecked())) {
                    marks = marks + 0;
                } else {
                    marks = marks + 1;
                }

                if (!o1.isChecked() && !o2.isChecked() && !o3.isChecked() && !o4.isChecked()) {
                    Toast.makeText(MainActivity12.this, "Please Select the Answer...!", Toast.LENGTH_LONG).show();
                } else {
                    Intent Int = new Intent(MainActivity12.this, MainActivity13.class);
                    Int.putExtra("name", user);
                    startActivity(Int);
                }
            }
        });

        pr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity12.this,MainActivity11.class);
                startActivity(in);
            }
        });
    }
}