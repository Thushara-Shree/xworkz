package com.xworkz.external;

import com.xworkz.internal.Pet;

public class Dog extends Pet {

    public Dog(){
        super();
        System.out.println("Running Dog const");
    }

    public void guard(){
        System.out.println("Running guard in Dog");
    }

    public void entertain(){
        System.out.println("Running entertain in Dog");
    }

    public void sleep(){
        System.out.println("Running sleep in Dog");
    }

    public void brighten(){
        System.out.println("Running brighten in Dog");
    }

    public void help(){
        System.out.println("Running help in Dog");
    }

    public void protect(){
        System.out.println("Running protect in Dog");
    }


}
