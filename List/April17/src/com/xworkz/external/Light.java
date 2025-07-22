package com.xworkz.external;

public interface Light {
    void turnOn();
    void turnOff();
    void dim();

    default void  see(){
        System.out.println("Running default method");
    }
}

