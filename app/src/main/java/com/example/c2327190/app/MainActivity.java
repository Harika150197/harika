package com.example.c2327190.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

// This is a test comment
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView rest1, rest2, rest3;
    SearchView mySearchView;
    ListView resList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    RecyclerView restView;
    RecyclerviewAdapter restAdapter;
    List<Receips> restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rest1 = (ImageView)findViewById(R.id.reddy);
        rest1.setOnClickListener(this);

        rest2 = (ImageView)findViewById(R.id.green);
        rest2.setOnClickListener(this);

        rest3 = (ImageView)findViewById(R.id.peter);
        rest3.setOnClickListener(this);



//        mySearchView = findViewById(R.id.searchView);
//        resList = findViewById(R.id.resList);
//
//        list = new ArrayList<String>();
//
//        list.add("Reddy Gari Restaurant");
//        list.add("Green Garden Restaurant");
//        list.add("Petter Rabbit Restaurant");
//        list.add("Minerva Grand Restaurant");
//        list.add("Restaurant 4");
//        list.add("Restaurant 5");
//        list.add("Restaurant 6");
//        list.add("Restaurant 11");
//        list.add("Restaurant 22");
//        list.add("Restaurant 33");
//        list.add("Restaurant 44");
//        list.add("Restaurant 55");
//        list.add("Restaurant 66");
//
//        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
//        resList.setAdapter(adapter);
//
//        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//
//                adapter.getFilter().filter(s);
//                return false;
//            }
//        });

//        restaurants = new ArrayList<>();
//        restaurants.add(new Receips("Reddy Gaari Restaurant\n",R.drawable.bg));
//        restaurants.add(new Receips("Green Garden Restaurant\n",R.drawable.bg));
//        restaurants.add(new Receips("Petter Rabbit Restaurant\n",R.drawable.bg));
//        restaurants.add(new Receips("Minerva Grand Restaurant\n",R.drawable.bg));
//
//        restView = (RecyclerView)findViewById(R.id.recycler_restaurants);
//
//        restAdapter = new RecyclerviewAdapter(this,restaurants);
//        restView.setLayoutManager(new GridLayoutManager(this,1));
//        restView.setAdapter(restAdapter);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.reddy:
                startActivity(new Intent(this, Rest1.class));
                break;
            case R.id.green:
                startActivity(new Intent(this, Rest2.class));
                break;
            case R.id.peter:
                startActivity(new Intent(this, Rest2.class));
                break;
        }
    }

}