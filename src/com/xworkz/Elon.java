package com.xworkz;

public class Elon {

    public void spaceX(Rocket rocket){
        System.out.println("Running Elon class");

        if(rocket!=null){
            rocket.nasa();

        }

        else{
            System.out.println("Reference is pointing to null");
        }
    }
}
