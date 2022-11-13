package com.example.khaskarawangapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class makananpage extends AppCompatActivity {
    private TextView mie1, hargamie;
    private ImageButton keranjangmp21;
    public static final String KEY21 = "Text";
    public static final String KEY22 = "gmbr";
    public static final String KEY23 = "harga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makananpage);

        hargamie = findViewById(R.id.hargamie);
        mie1 = findViewById(R.id.mie1);
        keranjangmp21 = findViewById(R.id.keranjangmp21);

        keranjangmp21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namabarang = hargamie.getText().toString();
                String hargag = mie1.getText().toString();
                Intent keranjang21 = new Intent(makananpage.this,pembayaranpage.class);
                keranjang21.putExtra(KEY21, namabarang);
                keranjang21.putExtra(KEY23, hargag);
                keranjang21.putExtra(KEY22, R.drawable.gmbrmie);
                startActivity(keranjang21);
            }
        });
    }
}