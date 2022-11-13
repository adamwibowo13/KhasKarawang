package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class onboard3 extends AppCompatActivity {
Button kiri2, kanan3, skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard3);

        kiri2 = findViewById(R.id.kiri2);
        kanan3 = findViewById(R.id.kanan3);
        skip = findViewById(R.id.skip);

        kiri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(onboard3.this, onboard2.class);
                startActivity(l);
            }
        });

        kanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(onboard3.this, pilihan.class);
                startActivity(m);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(onboard3.this, pilihan.class);
                startActivity(n);
            }
        });
    }
}