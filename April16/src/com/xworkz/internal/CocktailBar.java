package com.xworkz.internal;

import com.xworkz.external.Bar;

public class CocktailBar implements Bar {

    @Override
    public void serveDrink() {
        System.out.println("Serving a cocktail at the bar.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music at the bar.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bar area.");
    }
}

