package com.xworkz.external;

public interface Red {
    void brighten();
    void fade();
    void paint();

    default void  color(){
        System.out.println("Running color in Red");
    }
}

