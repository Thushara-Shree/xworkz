package com.xworkz.external;

public interface Marathon {
    void start();
    void run();
    void finish();

    default void sprint(){
        System.out.println("Running sprint in marathon");
    }
}

