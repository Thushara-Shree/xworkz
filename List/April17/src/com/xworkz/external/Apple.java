package com.xworkz.external;

public interface Apple {
    void grow();
    void harvest();
    void eat();

    default void taste(){
        System.out.println("Running taste in Apple");
    }
}

