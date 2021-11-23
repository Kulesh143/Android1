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
import android.widget.Toast;

public class SendSms extends AppCompatActivity {
private EditText phone,message;
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);
        phone=findViewById(R.id.editphone);
        message=findViewById(R.id.editmessage);
        send=findViewById(R.id.sendit);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int permission= ContextCompat.checkSelfPermission(SendSms.this, Manifest.permission.SEND_SMS);
                if(permission==PackageManager.PERMISSION_GRANTED){
                    //send sms
                    sendsms();
                }else{
                    ActivityCompat.requestPermissions(SendSms.this,new String[]{Manifest.permission.SEND_SMS},7);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 7:
                if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    //then send sms
                    sendsms();
                }else{
                    Toast.makeText(SendSms.this, "We need sms permission", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        }
    }
    private void sendsms(){
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phone.getText().toString().trim(),null,message.getText().toString().trim(),null,null);
    }
}