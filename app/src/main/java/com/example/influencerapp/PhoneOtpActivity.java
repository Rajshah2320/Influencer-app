package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneOtpActivity extends AppCompatActivity {
    private Button pLoginBtn;
    private TextView backTV,otpTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_otp);
        pLoginBtn=findViewById(R.id.plogin_btn);
        backTV=findViewById(R.id.back_tv);
        otpTV=findViewById(R.id.otp_tv);
        pLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(otpTV.toString())){
                    Toast.makeText(PhoneOtpActivity.this,"Enter otp",Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(PhoneOtpActivity.this,MainActivity.class));
                }
            }
        });
        backTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PhoneOtpActivity.this,PhoneLoginActivity.class));
            }
        });
    }
}
