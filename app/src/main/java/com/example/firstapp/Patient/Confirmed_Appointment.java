package com.example.firstapp.Patient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstapp.R;

public class Confirmed_Appointment extends AppCompatActivity {

    String username,password,user_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmed_appointment);

        Bundle bb = getIntent().getExtras();
        username = bb.getString("username");
        password = bb.getString("password");
        user_type = bb.getString("user_type");
    }
}