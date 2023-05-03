package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}