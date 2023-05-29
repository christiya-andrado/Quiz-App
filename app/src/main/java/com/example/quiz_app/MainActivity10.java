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

public class MainActivity10 extends AppCompatActivity {
ImageButton nxt8,pr8;
    RadioButton o1,o2,o3,o4;
    public static int marks = MainActivity9.marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main10);

        nxt8=(ImageButton) findViewById(R.id.next8);
        pr8=findViewById(R.id.pre8);
        o1=(RadioButton) findViewById(R.id.rb1);
        o2=(RadioButton) findViewById(R.id.rb2);
        o3=(RadioButton) findViewById(R.id.rb3);
        o4=(RadioButton) findViewById(R.id.rb4);
        String user=getIntent().getStringExtra("name");

        nxt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((o1.isChecked() || o2.isChecked() || o3.isChecked())) {
                    marks = marks + 0;
                } else {
                    marks = marks + 1;
                }

                if (!o1.isChecked() && !o2.isChecked() && !o3.isChecked() && !o4.isChecked()) {
                    Toast.makeText(MainActivity10.this, "Please Select the Answer...!", Toast.LENGTH_LONG).show();
                } else {
                    Intent Int = new Intent(MainActivity10.this, MainActivity11.class);
                    Int.putExtra("name", user);
                    startActivity(Int);
                }
            }
        });

        pr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity10.this,MainActivity9.class);
                startActivity(in);
            }
        });
    }
}