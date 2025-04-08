package com.xworkz.external;

import com.xworkz.internal.Bottle;

public class Plastic extends Bottle {

    public Plastic() {
        super();
        System.out.println("Running Plastic  const");
    }
    public void manufacture(){
        System.out.println("Running manufacture in Plastic");
    }

    public void color(){
        System.out.println("Running color in Plastic");
    }

    public void fill(){
        System.out.println("Running fill in Plastic");
    }

    public void openBottle(){
        System.out.println("Running openBottle in Plastic");
    }

    public void closeBottle(){
        System.out.println("Running closeBottle in Plastic");
    }

    public void quality(){
        System.out.println("Running quality in Plastic");
    }
}
