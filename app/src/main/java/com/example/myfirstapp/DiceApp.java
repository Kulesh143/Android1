package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceApp extends AppCompatActivity {
private ImageView ii;
private Button rollingg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_app);
        ii=findViewById(R.id.image);
        rollingg=findViewById(R.id.roling);
        final Random random=new Random();
    }

    public void rollOurDice(View view) {
        final Random random=new Random();
        int randomNumber=random.nextInt(6)+1;
        if(randomNumber==1){
            ii.setImageResource(R.drawable.one);
        }else if(randomNumber==2){
            ii.setImageResource(R.drawable.two);
        }
        else if(randomNumber==3){
            ii.setImageResource(R.drawable.three);
        }
        else if(randomNumber==4){
            ii.setImageResource(R.drawable.four);
        }
        else if(randomNumber==5){
            ii.setImageResource(R.drawable.five);
        }
        else if(randomNumber==6){
            ii.setImageResource(R.drawable.six);
        }
    }
}