package com.xworkz.external;

public interface Tap {
    void turnOn();
    void turnOff();
    void drip();

    default void  water(){
        System.out.println("Running default method");
    }
}

