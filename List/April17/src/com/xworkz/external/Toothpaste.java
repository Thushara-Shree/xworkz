package com.xworkz.external;

public interface Toothpaste {
    void apply();
    void cleanTeeth();
    void refreshBreath();

    default void  brush(){
        System.out.println("Running default method");
    }
}

