package com.xworkz.external;

public interface Steel {
    void melt();
    void shape();
    void cool();

    default void hard(){
        System.out.println("Running hard in steel");
    }
}

