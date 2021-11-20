package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Yourhome extends AppCompatActivity {
TextView yaEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourhome);
        yaEmail=findViewById(R.id.yaEmail);
        Intent i=getIntent();
        yaEmail.setText(i.getStringExtra("yaE"));
    }
}