package com.xworkz.internal;

import com.xworkz.external.Cartoon;

public class MickeyMouseCartoon implements Cartoon {

    @Override
    public void draw() {
        System.out.println("Drawing the Mickey Mouse cartoon.");
    }

    @Override
    public void animate() {
        System.out.println("Animating the Mickey Mouse cartoon.");
    }

    @Override
    public void display() {
        System.out.println("Displaying the Mickey Mouse cartoon.");
    }
}
