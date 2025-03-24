package com.xworkz.March24;

public class Food {

    public String sweet="Ladoo";
    String spicy="pickle";
    protected  String salty="chips";

    public void Indian(){
        System.out.println("Running Indian in Food");
        Mexican();
    }

    void Mexican(){
        System.out.println("Running Mexican in Food");
        System.out.println(salty);
    }
    protected void Chinese(){
        System.out.println("Running Chinese in Food");
    }

}
