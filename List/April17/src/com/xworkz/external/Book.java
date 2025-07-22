package com.xworkz.external;

public interface Book {
    void open();
    void read();
    void close();


    default void library(){
        System.out.println("Running library in book");
    }
}
