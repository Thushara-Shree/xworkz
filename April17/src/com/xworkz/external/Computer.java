package com.xworkz.external;

public interface Computer {

    void model();
    void company();
    void cost();

    default void games(){
        System.out.println("Running games in Computer");
    }
}
