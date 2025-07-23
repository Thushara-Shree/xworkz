package com.xworkz.external;

import com.xworkz.internal.Alcohol;

public class Beer extends Alcohol {

    public Beer() {
        super();
        System.out.println("Running Beer const");

    }
    public void Percentage(){
        System.out.println("Running Percentage in Beer");
    }

    public void price(){
        System.out.println("Running price in Beer");
    }

    public void type(){
        System.out.println("Running type in Beer");
    }

    public void brand(){
        System.out.println("Running brand in Beer");
    }

    public void age() {
        System.out.println("Running age in Alcohol");
    }
        public void bar(){
            System.out.println("Running Bar in beer");

    }
}
