package com.xworkz.internal;

public class Dish {
    private String name;
    private String cuisine;
    private boolean isVegetarian;

    public Dish(String name, String cuisine, boolean isVegetarian) {
        this.name = name;
        this.cuisine = cuisine;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Cuisine: " + cuisine + ", Vegetarian: " + (isVegetarian ? "Yes" : "No");
    }
}

