package com.xworkz.external;

import com.xworkz.internal.BackCover;

public class Jacket extends BackCover {

    public Jacket() {
        super();
        System.out.println("Running Jacket const");
    }

    public void color(){
        System.out.println("Running color in Jacket");
    }

    public void theme(){
        System.out.println("Running theme in Jacket");
    }

    public void material(){
        System.out.println("Running material in Jacket");
    }

    public void addBackCover(){
        System.out.println("Running addBackCover in Jacket");
    }

    public void remove(){
        System.out.println("Running remove in Jacket");
    }

    public void carry(){
        System.out.println("Running carry in Jacket");
    }
}
