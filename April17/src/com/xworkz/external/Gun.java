package com.xworkz.external;

public interface Gun {
    void load();
    void fire();
    void reload();

    default void aim(){
        System.out.println("Running aim in gun");
    }
}

