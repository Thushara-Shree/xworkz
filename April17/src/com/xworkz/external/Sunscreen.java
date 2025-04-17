package com.xworkz.external;

public interface Sunscreen {
    void apply();
    void protect();
    void remove();

    default void  cream(){
        System.out.println("Running default method");
    }
}

