package com.xworkz.external;

public interface Canteen {
    void serveFood();
    void cleanTables();
    void closeCanteen();

    default void food(){
        System.out.println("Running food in canteen");
    }
}

