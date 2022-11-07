package com.example.android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutTheGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_game);
    }

    public void launchMenu(View view) {
        Intent i = new Intent(AboutTheGame.this, Menu.class);
        startActivity(i);
    }
}