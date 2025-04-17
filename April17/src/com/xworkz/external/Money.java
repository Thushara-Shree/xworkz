package com.xworkz.external;

public interface Money {
    void earn();
    void spend();
    void save();

    default void  euro(){
        System.out.println("Running default method");
    }
}
