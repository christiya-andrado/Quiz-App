package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
Button Submit;
EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main2);

        Submit=(Button) findViewById(R.id.sub);
        name=(EditText) findViewById(R.id.username);

        String user=getIntent().getStringExtra("name");
        name.setText(user);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(name.getText().toString()))
                {
                    Toast.makeText(MainActivity2.this,"Please Enter your Name...",Toast.LENGTH_LONG).show();
                }
                else {
                    String user = name.getText().toString();
                    Intent Int = new Intent(MainActivity2.this, MainActivity3.class);
                    Int.putExtra("name", user);
                    startActivity(Int);
                }
            }
        });
    }
}