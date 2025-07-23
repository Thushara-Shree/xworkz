package com.xworkz.external;

import com.xworkz.internal.Luggage;

public class Bag extends Luggage {
    public Bag() {
        super();
        System.out.println("Running Bag const");
    }

    public void brand(){
        System.out.println("Running brand in Bag");
    }

    public void type(){
        System.out.println("Running type in Bag");
    }

    public void location(){
        System.out.println("Running location in Bag");
    }

    public void weight(){
        System.out.println("Running weight in Bag");
    }

    public void load(){
        System.out.println("Running  load in Bag");
    }

    public void wheel(){
        System.out.println("Running  wheel in Bag");
    }
}