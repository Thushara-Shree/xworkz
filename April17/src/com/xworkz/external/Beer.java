package com.xworkz.external;

public interface Beer {
    void pour();
    void drink();
    void chill();

    default void formula(){
        System.out.println("Running formula in Beer");
    }
}

