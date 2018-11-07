package com.sunnyvinay.jbossapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntroScreen extends AppCompatActivity {
    public void onContinue(View view) {
        Intent toMain = new Intent(IntroScreen.this, MainActivity.class);
        startActivity(toMain);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
