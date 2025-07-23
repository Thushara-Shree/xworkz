package com.xworkz.external;

import com.xworkz.internal.Chocolate;

public class KitKat extends Chocolate {

    public KitKat() {
        super();
        System.out.println("Running  KitKat  const");
    }
    public void makeChocolate(){
        System.out.println("Running makeChocolate in KitKat");
    }

    public void melt(){
        System.out.println("Running melt in KitKat");
    }

    public void buyChocolate(){
        System.out.println("Running buyChocolate in KitKat");
    }

    public void eatChocolate(){
        System.out.println("Running eatChocolate in KitKat");
    }

    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in KitKat");
    }

    public void taste(){
        System.out.println("Running taste in KitKat");
    }
}
