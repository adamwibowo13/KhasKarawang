package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pilihan extends AppCompatActivity {
Button masuk, daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan);

        masuk = findViewById(R.id.masuk);
        daftar = findViewById(R.id.daftar);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(pilihan.this, loginakun.class);
                startActivity(a);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(pilihan.this, Daftar.class);
                startActivity(b);
            }
        });
    }
}