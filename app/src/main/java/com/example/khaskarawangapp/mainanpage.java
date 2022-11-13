package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainanpage extends AppCompatActivity {

    private TextView textgasing1, hargagasing;
    private ImageButton keranjangmp41;
    public static final String KEY41 = "Textgasing";
    public static final String KEY42 = "gmbrgasing1";
    public static final String KEY43 = "harga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainanpage);

        textgasing1 = findViewById(R.id.textgasing1);
        hargagasing = findViewById(R.id.hargagasing);
        keranjangmp41 = findViewById(R.id.keranjangmp41);

        keranjangmp41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namabarang = textgasing1.getText().toString();
                String hargag = hargagasing.getText().toString();
                Intent keranjang41 = new Intent(mainanpage.this,pembayaranpage.class);
                keranjang41.putExtra(KEY41, namabarang);
                keranjang41.putExtra(KEY43, hargag);
                keranjang41.putExtra(KEY42, R.drawable.gmbrgasing);
                startActivity(keranjang41);

            }
        });

    }
}