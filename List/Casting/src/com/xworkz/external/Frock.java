package com.xworkz.external;

import com.xworkz.internal.Cloth;

public class Frock extends Cloth {

    public Frock() {
        super();
        System.out.println("Running  Frock  const");
    }

    public void buy(){
        System.out.println("Running plugIn in Frock");
    }

    public void fold(){
        System.out.println("Running remove in Frock");
    }

    public void color(){
        System.out.println("Running color in Frock");
    }

    public void size(){
        System.out.println("Running price in Frock");
    }
    public void price(){
        System.out.println("Running capacity in Frock");
    }

    public void shine(){
        System.out.println("Running shine in Frock");
    }
}

