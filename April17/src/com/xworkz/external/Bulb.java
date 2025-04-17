package com.xworkz.external;

public interface Bulb {
    void turnOn();
    void turnOff();
    void flicker();

    default void  light(){
        System.out.println("Running default method");
    }
}

