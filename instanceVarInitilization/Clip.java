package com.xworkz.March20;

public class Clip {

    Color color;

    public Clip(Color color){
        this.color=color;
        System.out.println("The color of clip is   "+color);
    }

    void hold(){
        System.out.println("Running hold in class Clip");
    }
}
