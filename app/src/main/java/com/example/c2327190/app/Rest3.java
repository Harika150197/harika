package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Rest3 extends AppCompatActivity {

    private ImageView menu1, menu2, menu3, menu4, menu5;
    private Button book;
    private TextView price1, price2, price3, price4, price5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest3);

        menu1 = (ImageView) findViewById(R.id.menu1);
        menu2 = (ImageView) findViewById(R.id.menu2);
        menu3 = (ImageView) findViewById(R.id.menu3);
        menu4 = (ImageView) findViewById(R.id.menu4);
        menu5 = (ImageView) findViewById(R.id.menu5);
        book = (Button) findViewById(R.id.book);
        price1 = (TextView)findViewById(R.id.price1);
        price2 = (TextView)findViewById(R.id.price2);
        price3 = (TextView)findViewById(R.id.price3);
        price4 = (TextView)findViewById(R.id.price4);
        price5 = (TextView)findViewById(R.id.price5);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rest3.this, BookTable.class);
                startActivity(intent);
            }
        });
    }
}