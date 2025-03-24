package com.xworkz.March24_1;

import com.xworkz.March24.Food;

public class HealthyFood {


    Food food;

    public HealthyFood(Food food) {
        this.food = food;
    }

    public void runHealthyFood() {
        if (this.food != null) {
            this.food.Indian();
            System.out.println(this.food.sweet);

        }
    }
}
