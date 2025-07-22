package com.xworkz.late.internal.imple;

public class FoodImpl implements Food {

    public FoodImpl() {
        System.out.println("FoodImpl object created.");
    }

    @Override
    public void eat() {
        System.out.println("Eating the food...");
    }
}
