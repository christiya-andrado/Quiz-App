package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
ImageButton nxt1,pr1;
public static int marks = 0;
    public static RadioButton o1,o2,o3,o4,s_ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main3);

        nxt1=(ImageButton) findViewById(R.id.next1);
        pr1=(ImageButton) findViewById(R.id.pre1);
        o1=(RadioButton) findViewById(R.id.rb1);
        o2=(RadioButton) findViewById(R.id.rb2);
        o3=(RadioButton) findViewById(R.id.rb3);
        o4=(RadioButton) findViewById(R.id.rb4);

        String user=getIntent().getStringExtra("name");

        nxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(o1.isChecked())
                {
                    marks = marks + 0;
                    s_ans=o1;
                }
                else if(o2.isChecked())
                {
                    marks = marks + 0;
                    s_ans=o2;
                }
                else if(o3.isChecked())
                {
                    marks=marks+1;
                    s_ans=o3;
                }
                else {
                    marks = marks + 0;
                    s_ans=o4;
                }

                if(!o1.isChecked() && !o2.isChecked() && !o3.isChecked() && !o4.isChecked()) {
                    Toast.makeText(MainActivity3.this,"Please Select the Answer...!",Toast.LENGTH_LONG).show();
                }
                else {

                    Intent Int = new Intent(MainActivity3.this, MainActivity4.class);
                    Int.putExtra("name", user);
                    startActivity(Int);

                }
            }
        });

        pr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Int = new Intent(MainActivity3.this, MainActivity2.class);
                Int.putExtra("name", user);
                startActivity(Int);
            }
        });
    }
}