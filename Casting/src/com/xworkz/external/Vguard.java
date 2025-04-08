package com.xworkz.external;

import com.xworkz.internal.Fan;

public class Vguard extends Fan {

    public Vguard() {
        super();
        System.out.println("Running Vguard  const");
    }

    public void buy(){
        System.out.println("Running plugIn in Vguard");
    }

    public void rotate(){
        System.out.println("Running remove in Vguard");
    }

    public void color(){
        System.out.println("Running color in Vguard");
    }

    public void brand(){
        System.out.println("Running price in Vguard");
    }
    public void price(){
        System.out.println("Running capacity in Vguard");
    }

    public void breeze(){
        System.out.println("Running breeze in Vguard");
    }
}
