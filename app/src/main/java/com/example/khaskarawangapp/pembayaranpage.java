package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pembayaranpage extends AppCompatActivity {

    private ImageView iconbarang;
    private TextView namabarang, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaranpage);

        iconbarang = findViewById(R.id.iconbarang);
        namabarang = findViewById(R.id.namabarang);
        harga = findViewById(R.id.harga);


        Intent i = getIntent();
        String inputnama = i.getStringExtra(mainanpage.KEY41);
        String inputharga = i.getStringExtra(mainanpage.KEY43);
        int inputicon = i.getIntExtra(mainanpage.KEY42,1);
        namabarang.setText(inputnama);
        harga.setText(inputharga);
        iconbarang.setImageResource(inputicon);

    }

}