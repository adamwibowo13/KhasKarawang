package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class loginakun extends AppCompatActivity {
Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginakun);

        masuk=findViewById(R.id.masuk);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(loginakun.this, dashboard.class);
                startActivity(c);
            }
        });
    }
}