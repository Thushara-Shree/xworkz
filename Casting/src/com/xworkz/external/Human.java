package com.xworkz.external;

import com.xworkz.internal.Scientist;

public class Human extends Scientist {

    public Human(){
        super();
        System.out.println("Running Human const");
    }

    public void lab(){
        System.out.println("Running lab in Human");
    }

    public void research(){
        System.out.println("Running research in Human");
    }

    public void discover(){
        System.out.println("Running discover in Human");
    }

    public void experiment(){
        System.out.println("Running experiment in Human");
    }

    public void find(){
        System.out.println("Running find in Human");
    }

    public  void work(){
        System.out.println("Running work in Human");
    }
}
