package com.xworkz.internal;

import com.xworkz.external.Apple;

public class GrannySmithApple implements Apple {

    @Override
    public void grow() {
        System.out.println("The Granny Smith apple is growing.");
    }

    @Override
    public void harvest() {
        System.out.println("The Granny Smith apple is being harvested.");
    }

    @Override
    public void eat() {
        System.out.println("Eating the Granny Smith apple.");
    }

    @Override
    public void taste() {
        Apple.super.taste();
    }
}

