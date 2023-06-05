package com.example.hortifruti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private EditText EmailEdit;
    private EditText SenhaEdit;
    private Button Entrar;
    private ProgressBar Progresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#FFFFFF"));

        EmailEdit = findViewById(R.id.EmailEdit);
        SenhaEdit = findViewById(R.id.SenhaEdit);
        Entrar = findViewById(R.id.Entrar);
        Progresso = findViewById(R.id.Progresso);

        Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = EmailEdit.getText().toString();
                String senha = SenhaEdit.getText().toString();

                if (email.isEmpty()) {
                    EmailEdit.setError("Digite o Email!");
                } else if (senha.isEmpty()) {
                    SenhaEdit.setError("Digite a senha!");
                } else if (email.contains("@gmail.com")) {
                    Snackbar snackbar = Snackbar.make(v, "Email inválido!", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                } else if (senha.length() <= 5) {
                    Snackbar snackbar = Snackbar.make(v, "Senha inválida, precisa ter pelo menos 6 caracteres!", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                } else {
                    login(v);
                }
            }
        });
    }

    private void login(final View view) {
        Progresso.setVisibility(View.VISIBLE);

        Entrar.setEnabled(false);
        Entrar.setTextColor(Color.parseColor("#FFFFFF"));

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                navegarTelaPrincipal();
                Snackbar snackbar = Snackbar.make(view, "Login efetuado com sucesso!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        }, 3000);
    }

    private void navegarTelaPrincipal() {
        Intent intent = new Intent(this,TelaPrincipal.class);
        startActivity(intent);
        finish();
    }
}
