package com.xworkz.external;

public interface Flower {
    void bloom();
    void fragrance();
    void wither();

    default void  smell(){
        System.out.println("Running default method");
    }
}
