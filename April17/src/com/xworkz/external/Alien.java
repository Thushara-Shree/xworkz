package com.xworkz.external;

public interface Alien {
    void communicate();
    void invade();
    void disguise();

    default void mars(){
        System.out.println("Running mars in Alien");
    }
}
