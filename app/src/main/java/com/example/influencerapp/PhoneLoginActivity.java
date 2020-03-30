package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class PhoneLoginActivity extends AppCompatActivity {
    private Button submitBtn;
    private AutoCompleteTextView phoneTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        submitBtn=findViewById(R.id.submit_btn);
        phoneTV=findViewById(R.id.phone_tv);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(phoneTV.toString())){
                    Toast.makeText(PhoneLoginActivity.this,"Enter number",Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(PhoneLoginActivity.this,PhoneOtpActivity.class));
                }
            }
        });
    }
}
