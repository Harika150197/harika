package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BookTable extends AppCompatActivity {
    private ImageView live1, live2, live3, live4, live5, live6,
                        live7, live8, live9;
    private TextView table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_table);

        live1 = (ImageView) findViewById(R.id.live1);
        live2 = (ImageView) findViewById(R.id.live2);
        live3 = (ImageView) findViewById(R.id.live3);
        live4 = (ImageView) findViewById(R.id.live4);
        live5 = (ImageView) findViewById(R.id.live5);
        live6 = (ImageView) findViewById(R.id.live6);
        live7 = (ImageView) findViewById(R.id.live7);
        live8 = (ImageView) findViewById(R.id.live8);
        live9 = (ImageView) findViewById(R.id.live9);

        live1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });

        live9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTable.this, BookingDetails.class);
                startActivity(intent);
            }
        });
    }
}