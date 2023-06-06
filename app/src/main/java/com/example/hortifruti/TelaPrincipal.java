package com.example.hortifruti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#00a86b"));
        Intent intent = new Intent(getBaseContext(),Ofertas.class);
    }
}
