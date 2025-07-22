package com.xworkz.external;

public interface Planet {
    void rotate();
    void revolve();
    void supportLife();

    default void  life(){
        System.out.println("Running default method");
    }
}

