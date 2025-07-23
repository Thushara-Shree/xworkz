package com.xworkz.external;

import com.xworkz.internal.Eraser;

public class Doms extends Eraser {
    public Doms() {
        super();
        System.out.println("Running Doms  const");
    }

    public void buy(){
        System.out.println("Running plugIn in Doms");
    }

    public void eraser(){
        System.out.println("Running remove in Doms");
    }

    public void color(){
        System.out.println("Running color in Doms");
    }

    public void use(){
        System.out.println("Running price in Doms");
    }
    public void price(){
        System.out.println("Running capacity in Doms");
    }

    public void dust(){
        System.out.println("Running dust in Doms");
    }
}
