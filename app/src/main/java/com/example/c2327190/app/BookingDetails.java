package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BookingDetails extends AppCompatActivity {

    private TextView details, persons, display;
    private EditText name, number;
    private Button dic, inc, confirm;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        inc = (Button) findViewById(R.id.inc);
        dic = (Button) findViewById(R.id.dec);
        confirm = (Button) findViewById(R.id.confirm);
        display = (TextView) findViewById(R.id.display);
        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);
         inc.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 count++;
                 display.setText(""+count);
             }
         });
         dic.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (count < 0) count=0;
                 else
                     count--;
                 display.setText(""+count);
             }
         });

         confirm.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(BookingDetails.this, Confirmed.class);
                 startActivity(intent);
             }
         });
    }
}