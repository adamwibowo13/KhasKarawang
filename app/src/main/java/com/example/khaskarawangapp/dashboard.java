package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
ImageButton bmakanan,bminuman, bsnack, bmainan, bshopingbag, baksesoris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        bmakanan=findViewById(R.id.bmakanan);
        bminuman=findViewById(R.id.bminuman);
        bsnack=findViewById(R.id.bsnack);
        bmainan=findViewById(R.id.bmainan);
        bshopingbag=findViewById(R.id.bshopingbag);
        baksesoris=findViewById(R.id.baksesoris);

        bmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(dashboard.this, makananpage.class);
                startActivity(q);
            }
        });
        bminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(dashboard.this, minumanpage.class);
                startActivity(w);
            }
        });

        bsnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(dashboard.this, snackpage.class);
                startActivity(e);
            }
        });

        baksesoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(dashboard.this, aksesorispage.class);
                startActivity(r);
            }
        });

        bshopingbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(dashboard.this, buatantanganpage.class);
                startActivity(t);
            }
        });

        bmainan.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(dashboard.this, mainanpage.class);
                startActivity(y);
            }
        });

    }
}