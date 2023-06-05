package com.example.hortifruti;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;


public class Ofertas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);

        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#00a86b"));

    }
}