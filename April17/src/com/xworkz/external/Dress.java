package com.xworkz.external;

public interface Dress {
    void wear();
    void remove();
    void iron();

    default void code(){
        System.out.println("Running code in Dress");
    }
}

