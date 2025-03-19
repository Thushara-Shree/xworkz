package com.xworkz;

public class Alien {

    public void mars(Space space){
        System.out.println("Running Alien class");

        if(space!=null){
            space.asteroid();

        }

        else{
            System.out.println("Reference is pointing to null");
        }
    }
}
