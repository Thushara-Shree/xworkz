package com.xworkz.external;

import com.xworkz.internal.Chair;

public class Seat extends Chair {

    public  Seat () {
        super();
        System.out.println("Running  Seat  const");
    }

    public void manufacture(){
        System.out.println("Running manufacture in Seat");
    }

    public void color(){
        System.out.println("Running color in Seat");
    }

    public void price(){
        System.out.println("Running price in Seat");
    }

    public void buyChair(){
        System.out.println("Running buyChair in Seat");
    }

    public void breakChair(){
        System.out.println("Running breakChair in Seat");
    }

    public void sit(){
        System.out.println("Running sit in Seat");
    }
}
