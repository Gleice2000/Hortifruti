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
    private EditText emailEdit;
    private EditText senhaEdit;
    private Button entrarButton;
    private ProgressBar progressoBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#FFFFFF"));

        emailEdit = findViewById(R.id.EmailEdit);
        senhaEdit = findViewById(R.id.SenhaEdit);
        entrarButton = findViewById(R.id.Entrar);
        progressoBar = findViewById(R.id.Progresso);

        entrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEdit.getText().toString();
                String senha = senhaEdit.getText().toString();

                if (email.isEmpty()) {
                    emailEdit.setError("Digite o Email!");

                } else if (senha.isEmpty()) {
                    senhaEdit.setError("Digite a senha!");
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
        progressoBar.setVisibility(View.VISIBLE);

        entrarButton.setEnabled(false);
        entrarButton.setTextColor(Color.parseColor("#FFFFFF"));

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
        Intent intent = new Intent(MainActivity.this, Ofertas.class);
        startActivity(intent);
        finish();
    }
}
