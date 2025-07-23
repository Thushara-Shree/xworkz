package com.xworkz.external;

public interface Bat {
    void fly();
    void screech();
    void hang();

    default void  hit(){
        System.out.println("Running hit in Bat");
    }
}

