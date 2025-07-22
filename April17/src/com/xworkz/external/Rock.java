package com.xworkz.external;

public interface Rock {
    void roll();
    void breakIntoPieces();
    void stack();

    default void  hard(){
        System.out.println("Running default method");
    }
}

