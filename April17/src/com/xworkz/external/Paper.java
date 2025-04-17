package com.xworkz.external;

public interface Paper {
    void write();
    void tear();
    void recycle();

    default void  sheet(){
        System.out.println("Running default method");
    }
}

