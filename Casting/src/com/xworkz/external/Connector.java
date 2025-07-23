package com.xworkz.external;

import com.xworkz.internal.Charger;

public class Connector extends Charger {

    public  Connector () {
        super();
        System.out.println("Running  Connector  const");
    }

    public void plugIn(){
        System.out.println("Running plugIn in Connector");
    }

    public void remove(){
        System.out.println("Running remove in Connector");
    }

    public void color(){
        System.out.println("Running color in Connector");
    }

    public void price(){
        System.out.println("Running price in Connector");
    }

    public void capacity(){
        System.out.println("Running capacity in Connector");
    }

    public void load(){
        System.out.println("Running load in Connector");
    }
}
