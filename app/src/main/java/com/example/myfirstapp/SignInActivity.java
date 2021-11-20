package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {
EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
    }

    public void GetIN(View view) {
        if(email.getText().toString().equals("kulesh143143@yahoo.com")&&pass.getText().toString().equals("143")){
        Intent intent=new Intent(this,HomeActivity.class);
        intent.putExtra("Email",email.getText().toString());
        startActivity(intent);
        }
    }
}