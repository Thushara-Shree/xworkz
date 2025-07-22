package com.xworkz.external;

public interface Zoo {
    void open();
    void feedAnimals();
    void close();

    default void animals(){
        System.out.println("Running animals in zoo");
    }
}

