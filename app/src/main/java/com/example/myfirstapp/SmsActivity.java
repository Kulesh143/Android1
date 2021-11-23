package com.example.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {
private EditText phone,message;
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
      phone=findViewById(R.id.enterphone);
      message=findViewById(R.id.entermessage);
      send=findViewById(R.id.sendsms);
      send.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              int permission=ContextCompat.checkSelfPermission(SmsActivity.this,Manifest.permission.SEND_SMS);
              if(permission==PackageManager.PERMISSION_GRANTED){
                  //then we will send the sms
                  sendSMS();
              }else{
                  ActivityCompat.requestPermissions(SmsActivity.this,new String[]{Manifest.permission.SEND_SMS},7);
              }
          }
      });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch(requestCode){
            case 7:
                if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                         sendSMS();
                }else{
                    Toast.makeText(SmsActivity.this, "We nedd permission", Toast.LENGTH_SHORT).show();
                }break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
    private void sendSMS(){
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phone.getText().toString().trim(),null,message.getText().toString().trim(),null,null);
    }

}