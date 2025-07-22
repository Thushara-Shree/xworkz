package com.xworkz.external;

public interface Chocolate {
    void melt();
    void eat();
    void smell();

    default void  sweet(){
        System.out.println("Running sweet in Chocolate");
    }
}

