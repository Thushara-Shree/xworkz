package com.xworkz.external;

import com.xworkz.internal.Medicine;

public class Syrup extends Medicine {

    public Syrup() {
        super();
        System.out.println("Running   Syrup  const");
    }

    public void drink(){
        System.out.println("Running color in Syrup");
    }

    public void buy(){
        System.out.println("Running buy in Syrup");
    }

    public void sell(){
        System.out.println("Running sell in Syrup");
    }

    public void apply(){
        System.out.println("Running apply in Syrup");
    }

    public void price(){
        System.out.println("Running price in Syrup");
    }

    public void cure(){
        System.out.println("Running cure in Syrup");
    }
}
