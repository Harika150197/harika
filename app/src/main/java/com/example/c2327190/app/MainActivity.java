package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

// This is a test comment
public class MainActivity extends AppCompatActivity {
    SearchView mySearchView;
    ListView resList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySearchView = findViewById(R.id.searchView);
        resList = findViewById(R.id.resList);

        list = new ArrayList<String>();

        list.add("Restaurant 1");
        list.add("Restaurant 2");
        list.add("Restaurant 3");
        list.add("Restaurant 4");
        list.add("Restaurant 4");
        list.add("Restaurant 5");
        list.add("Restaurant 6");
        list.add("Restaurant 11");
        list.add("Restaurant 22");
        list.add("Restaurant 33");
        list.add("Restaurant 44");
        list.add("Restaurant 55");
        list.add("Restaurant 66");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        resList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);
                return false;
            }
        });
    }
}