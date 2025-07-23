package com.xworkz.external;

import com.xworkz.internal.Die;

public class Ink extends Die {
    public Ink(){
        super();
        System.out.println("Running Ink  Constructor");
    }

    public void  stain(){
        System.out.println("Running stain in Ink");
    }

    public void shade(){
        System.out.println("Running  shade in Ink");
    }

    public void intensity(){
        System.out.println("Running intensit in Ink");
    }

    public void darkness(){
        System.out.println("Running darkness in Ink");
    }

    public void  ratio(){
        System.out.println("Running ratio in Ink");
    }

    public void  color(){
        System.out.println("Running color in Ink");
    }
}
