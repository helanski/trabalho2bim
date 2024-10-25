package com.example.trabalho4bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText editTextNome;
    private EditText editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        editTextNome = findViewById(R.id.editTextNome);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void MainActivity2(View v) {
        // Intent faz transição entre telas
        Intent tela = new Intent(this, MainActivity2.class); //de onde está; para onde vai
    }
}