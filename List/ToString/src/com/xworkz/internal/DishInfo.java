package com.xworkz.internal;

public class DishInfo {
    private Dish dish;
    private int calories;
    private String servedWith;

    public DishInfo(Dish dish, int calories, String servedWith) {
        this.dish = dish;
        this.calories = calories;
        this.servedWith = servedWith;
    }

    @Override
    public String toString() {
        return "Dish Info:\n" +
                dish.toString() + "\n" +
                "Calories: " + calories + " kcal\n" +
                "Served With: " + servedWith;
    }
}

