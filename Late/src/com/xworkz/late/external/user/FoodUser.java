package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Food;

public class FoodUser {
    private Food food;

    public FoodUser(Food food) {
        this.food = food;
    }

    public void useFood() {
        if (food != null) {
            food.eat();
        } else {
            System.out.println("Food is not available.");
        }
    }
}
