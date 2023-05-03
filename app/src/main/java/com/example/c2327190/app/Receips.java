package com.example.c2327190.app;

public class Receips {

    private String restaurantName;
    private int thumbNail;

    public Receips(String name, int thumbNail){

        restaurantName = name;
        thumbNail = thumbNail;
    }

    public int getThumbNail(){
        return thumbNail;
    }
    public String getRestaurantName(){
        return restaurantName;
    }
}
