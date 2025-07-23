package com.xworkz.external;

public interface Chalk {
    void write();
    void erase();
    void breakIt();

    default void  dust(){
        System.out.println("Running default method");
    }
}

