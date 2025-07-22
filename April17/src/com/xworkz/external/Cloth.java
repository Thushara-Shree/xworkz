package com.xworkz.external;

public interface Cloth {
    void wear();
    void wash();
    void fold();

    default void cost(){
        System.out.println("Running cost in Cloth");
    }
}

