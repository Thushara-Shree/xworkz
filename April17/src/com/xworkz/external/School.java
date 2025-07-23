package com.xworkz.external;

public interface School {
    void study();
    void play();
    void attendAssembly();

    default void learn(){
        System.out.println("Running learn in School");
    }
}
