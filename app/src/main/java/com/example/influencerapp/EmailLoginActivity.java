package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailLoginActivity extends AppCompatActivity {
    private Button loginBtn;
    private AutoCompleteTextView emailTV;
    private EditText passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);
        loginBtn=findViewById(R.id.login_btn);
        emailTV=findViewById(R.id.email_tv);
        passwordET=findViewById(R.id.password_tv);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(emailTV.toString())||TextUtils.isEmpty(passwordET.toString())){
                    Toast.makeText(EmailLoginActivity.this,"Enter email and password",Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(EmailLoginActivity.this,MainActivity.class));
                }
            }
        });
    }



}
