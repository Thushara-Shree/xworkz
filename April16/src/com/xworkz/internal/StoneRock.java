package com.xworkz.internal;

import com.xworkz.external.Rock;

public class StoneRock implements Rock {

    @Override
    public void roll() {
        System.out.println("The stone rock is rolling down the hill.");
    }

    @Override
    public void breakIntoPieces() {
        System.out.println("The stone rock breaks into smaller pieces.");
    }

    @Override
    public void stack() {
        System.out.println("The stone rock is being stacked.");
    }
}
