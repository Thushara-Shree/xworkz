package com.xworkz.external;

public interface Fish {
    void swim();
    void eat();
    void breathe();

    default void type(){
        System.out.println("Running type in Fish");
    }
}
