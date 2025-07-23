package com.xworkz.external;

public interface Train {
    void start();
    void stop();
    void accelerate();

    default void track(){
        System.out.println("Running track in train");
    }
}

