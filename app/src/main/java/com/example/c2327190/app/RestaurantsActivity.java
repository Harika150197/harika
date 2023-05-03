package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    private TextView restaurantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        restaurantName = (TextView) findViewById(R.id.text_restaurant);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("restaurantName");

        restaurantName.setText(Title);


    }
}