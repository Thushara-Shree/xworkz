package com.xworkz;

public class Season {

    public void taste(Mango mango){

        System.out.println("Running Season class");

        if(mango!=null){
            mango.flavor();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

    }
}
