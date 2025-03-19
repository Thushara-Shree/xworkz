package com.xworkz;

public class Shop {

    public void ads(Display display) {

        System.out.println("Running shop class");
        if(display!=null){
            display.run();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

    }
    }

