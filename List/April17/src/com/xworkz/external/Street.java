package com.xworkz.external;

public interface Street {
    void open();
    void close();
    void repair();

    default void  walk(){
        System.out.println("Running default method");
    }
}

