package com.xworkz.external;

import com.xworkz.internal.Battery;

public class EveryDay extends Battery {

    public EveryDay() {
        super();
        System.out.println("Running EveryDay const");
    }

    public void buy(){
        System.out.println("Running plugIn in EveryDay");
    }

    public void plug(){
        System.out.println("Running remove in EveryDay");
    }

    public void blast(){
        System.out.println("Running color in EveryDay");
    }

    public void size(){
        System.out.println("Running price in EveryDay");
    }
    public void price(){
        System.out.println("Running capacity in EveryDay");
    }

    public void terminal(){
        System.out.println("Running terminal in EveryDay");
    }
}
