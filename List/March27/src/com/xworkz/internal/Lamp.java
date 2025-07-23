package com.xworkz.internal;

public class Lamp {

    private String color;
    private Warrenty warrenty;

    public Lamp(String color,Warrenty warrenty){
        this.color=color;
        this.warrenty=warrenty;
    }

    public void Light(){
        System.out.println("Running Light in Lamp");
        System.out.println("The color of lamp is: "+this.color);
        this.warrenty.years();
    }
}
