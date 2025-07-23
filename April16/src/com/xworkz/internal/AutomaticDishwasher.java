package com.xworkz.internal;

import com.xworkz.external.Dishwash;

public class AutomaticDishwasher implements Dishwash {

    @Override
    public void wash() {
        System.out.println("Washing the dishes.");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing the dishes.");
    }

    @Override
    public void dry() {
        System.out.println("Drying the dishes.");
    }
}
