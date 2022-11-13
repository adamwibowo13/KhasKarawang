package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Daftar extends AppCompatActivity {
Button bdaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        bdaftar=findViewById(R.id.bdaftar);

        bdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Daftar.this, dashboard.class);
                startActivity(d);
            }
        });
    }
}