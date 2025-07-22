package com.xworkz.external;

public interface River {
    void flow();
    void bend();
    void provideWater();

    default void  run(){
        System.out.println("Running default method");
    }
}
