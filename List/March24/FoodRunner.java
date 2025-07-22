package com.xworkz.March24;

import com.xworkz.March24_1.HealthyFood;

public class FoodRunner {
    public static void main(String[] args) {
        Food food=new Food();
        FastFood fastFood=new FastFood(food);
        fastFood.RunyFastFood();
        fastFood.DisplayFastFood();

        HealthyFood healthyFood=new HealthyFood(food);
        healthyFood.runHealthyFood();
    }
}
