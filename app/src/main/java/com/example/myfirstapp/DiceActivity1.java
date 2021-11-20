package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceActivity1 extends AppCompatActivity {
private ImageView iv;
private Button roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice1);
        iv=findViewById(R.id.iv);
        roll=findViewById(R.id.rolldice);
        final Random random=new Random();

    }

    public void rollThis(View view) {
        final Random random=new Random();
        int randomNumber=random.nextInt(6)+1;
        if(randomNumber==1){
            iv.setImageResource(R.drawable.one);
        }else if(randomNumber==2){
            iv.setImageResource(R.drawable.two);
        }else if(randomNumber==3){
            iv.setImageResource(R.drawable.three);
        }else if(randomNumber==4){
            iv.setImageResource(R.drawable.four);
        }else if(randomNumber==5){
            iv.setImageResource(R.drawable.five);
        }else if(randomNumber==6){
            iv.setImageResource(R.drawable.six);
        }
    }
}