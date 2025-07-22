package com.xworkz.external;

import com.xworkz.internal.Fruit;

public class Apple extends Fruit {

    public Apple(){
        super();
        System.out.println("Running Apple const");
    }

    public void juice(){
        System.out.println("Running Juice in Apple");
    }

    public void eat(){
        System.out.println("Running eat in Apple");
    }

    public void salad(){
        System.out.println("Running salad in Apple");
    }

    public void icecream(){
        System.out.println("Running icecream in Apple");
    }

    public void jam(){
        System.out.println("Running jam in Apple");
    }

    public void sweet(){
        System.out.println("Running sweet in Apple");
    }
}
