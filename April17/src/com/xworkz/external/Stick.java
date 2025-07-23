package com.xworkz.external;

public interface Stick {
    void breakIt();
    void useIt();
    void bendIt();

    default void  hit(){
        System.out.println("Running default method");
    }
}
