package com.xworkz.external;

public interface Carrot {
    void grow();
    void harvest();
    void eat();

    default void  grass(){
        System.out.println("Running default method");
    }
}

