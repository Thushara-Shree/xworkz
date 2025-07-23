package com.xworkz.external;

public interface Dishwash {
    void wash();
    void rinse();
    void dry();

    default void clean(){
        System.out.println("Running clean in Dishwasher");
    }
}

