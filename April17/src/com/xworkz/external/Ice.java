package com.xworkz.external;

public interface Ice {
    void freeze();
    void melt();
    void chill();

    default void  cold(){
        System.out.println("Running default method");
    }
}
