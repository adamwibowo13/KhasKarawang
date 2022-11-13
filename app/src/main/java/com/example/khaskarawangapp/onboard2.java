package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class onboard2 extends AppCompatActivity {
Button kiri, kanan2, skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard2);

        kiri = findViewById(R.id.kiri);
        kanan2 = findViewById(R.id.kanan2);
        skip = findViewById(R.id.skip);

        kiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(onboard2.this, onboard1.class);
                startActivity(g);
            }
        });

        kanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(onboard2.this, onboard3.class);
                startActivity(h);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(onboard2.this, pilihan.class);
                startActivity(x);
            }
        });

    }
}