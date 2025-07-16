package com.xworkz.external;

public interface Seat {
    void sit();
    void adjust();
    void recline();

    default void  sleep(){
        System.out.println("Running default method");
    }
}
