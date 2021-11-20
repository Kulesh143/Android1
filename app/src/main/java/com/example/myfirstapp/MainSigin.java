package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainSigin extends AppCompatActivity {
EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sigin);
        email=findViewById(R.id.email1);
        password=findViewById(R.id.password1);
    }

    public void goHome(View view) {
        if(email.getText().toString().equals("kulesh143143@yahoo.com")&&password.getText().toString().equals("143")){
          Intent intent=new Intent(this,Yourhome.class);
          intent.putExtra("yaE",email.getText().toString());
          startActivity(intent);
    }else{
            Toast.makeText(MainSigin.this, "You have entered wrong credentials!", Toast.LENGTH_SHORT).show();
        }
    }
}