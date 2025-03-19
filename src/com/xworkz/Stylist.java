package com.xworkz;

public class Stylist {

    public void scissor(Barber barber){
        System.out.println("Running Stylist  class");
        if(barber!=null){
            barber.cut();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

    }
}
