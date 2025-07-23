package com.xworkz.external;

public interface Warden {
    void monitor();
    void supervise();
    void discipline();

    default void guide(){
        System.out.println("Running guide in warden");
    }
}

