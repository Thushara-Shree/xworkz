package com.xworkz.external;

public interface Ghee {
    void melt();
    void cook();
    void flavor();

    default void  taste(){
        System.out.println("Running default method");
    }
}
