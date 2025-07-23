package com.xworkz.external;

public interface Chips {

    void flavor();
    void oil();
    void type();

    default void taste(){
        System.out.println("Running taste in chips");
    }
}
