package com.xworkz.external;

public interface Taxi {
    void pickUp();
    void drive();
    void dropOff();

    default void  ride(){
        System.out.println("Running default method");
    }
}
