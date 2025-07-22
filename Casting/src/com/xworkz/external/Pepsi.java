package com.xworkz.external;

import com.xworkz.internal.Coke;

public class Pepsi extends Coke {

    public Pepsi() {
        super();
        System.out.println("Running  Pepsi const");
    }

    public void buy(){
        System.out.println("Running plugIn in Pepsi");
    }

    public void state(){
        System.out.println("Running remove in Pepsi");
    }

    public void color(){
        System.out.println("Running color in Pepsi");
    }

    public void use(){
        System.out.println("Running price in Pepsi");
    }
    public void price(){
        System.out.println("Running capacity in Pepsi");
    }

    public void brand(){
        System.out.println("Running brand in Pepsi");
    }
}
