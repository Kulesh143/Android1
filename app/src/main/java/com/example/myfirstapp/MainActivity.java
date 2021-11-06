package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private TextView txt;
private Button plus,minus,reset,btnshow;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt1);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        reset = findViewById(R.id.reset);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        reset.setOnClickListener(this);
        btnshow=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imageView.getVisibility()==View.GONE){
                    imageView.setVisibility(View.VISIBLE);
                }else{
                    imageView.setVisibility(View.GONE);
                }
            }
        });
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int counter= Integer.parseInt(txt.getText().toString());
//                counter++;
//                txt.setText(counter+"");
//                Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//            }
//        });
//        minus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int counter=Integer.parseInt(txt.getText().toString());
//                if(counter!=0){
//                counter--;
//                txt.setText(counter+"");
//                Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//
//            }}
//        });
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                txt.setText("0");
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        int counter=0;
        switch (id){
            case R.id.plus:
                counter= Integer.parseInt(txt.getText().toString());
                counter++;
                txt.setText(counter+"");
                Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
                break;
            case R.id.minus:
                counter=Integer.parseInt(txt.getText().toString());
                if(counter!=0){
                    counter--;
                    txt.setText(counter+"");
                    Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.reset:
                txt.setText("0");
                break;
        }
    }

//
//    public void plusmethod(View view) {
//        int counter= Integer.parseInt(txt.getText().toString());
//        counter++;
//        txt.setText(counter+"");
//        Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//    }
//
//    public void minusmethod(View view) {
//        int counter=Integer.parseInt(txt.getText().toString());
//        if(counter!=0){
//            counter--;
//            txt.setText(counter+"");
//            Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//
//        }
//    }
//
//    public void resetmethod(View view) {
//
//        txt.setText("0");
//    }

//    public void operation(View view) {
//        int id=view.getId();
//        int counter=0;
//        switch (id){
//            case R.id.plus:
//                counter= Integer.parseInt(txt.getText().toString());
//                counter++;
//                txt.setText(counter+"");
//                Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.minus:
//                counter=Integer.parseInt(txt.getText().toString());
//                if(counter!=0){
//                    counter--;
//                    txt.setText(counter+"");
//                    Toast.makeText(MainActivity.this,counter+"",Toast.LENGTH_SHORT).show();
//
//                }
//                break;
//            case R.id.reset:
//                txt.setText("0");
//                break;
//        }
//    }
}