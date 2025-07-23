package com.xworkz.external;

public interface IceCream {
    void serve();
    void melt();
    void freeze();

    default void eat(){
        System.out.println("Runningg eat in IceCream");
    }
}

