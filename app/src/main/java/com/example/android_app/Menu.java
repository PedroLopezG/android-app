package com.example.android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onAboutGame(View view) {
        Intent i = new Intent(Menu.this, AboutTheGame.class);
        startActivity(i);
    }

    public void irALogin(View view) {
        Intent i = new Intent(Menu.this, MainActivity.class);
        startActivity(i);
    }

    public void onIraPjs(View view) {
        Intent i = new Intent(Menu.this, Personajes.class);
        startActivity(i);
    }
}