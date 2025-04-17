package com.xworkz.external;

public interface Star {
    void shine();
    void twinkle();
    void explode();

    default void  infinte(){
        System.out.println("Running default method");
    }
}

