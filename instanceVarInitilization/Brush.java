package com.xworkz.March20;

public class Brush {

    Color color;

    public Brush(Color color){
        this.color=color;
        System.out.println("The color of brush is   "+color);

    }

    void clean(){
        System.out.println("Running clean method in Brush");
    }
    void scrub(){
        System.out.println("Running scrub method in Brush");
    }
}
