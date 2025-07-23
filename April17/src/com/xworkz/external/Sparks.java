package com.xworkz.external;

public interface Sparks {
    void ignite();
    void fly();
    void fadeOut();

    default void  light(){
        System.out.println("Running default method");
    }
}
