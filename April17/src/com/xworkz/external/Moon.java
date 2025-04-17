package com.xworkz.external;

public interface Moon {
    void shine();
    void reflect();
    void orbit();

    default void  white(){
        System.out.println("Running default method");
    }
}
