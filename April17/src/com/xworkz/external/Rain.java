package com.xworkz.external;

public interface Rain {
    void fall();
    void stop();
    void pour();

    default void  coat(){
        System.out.println("Running default method");
    }
}

