package com.xworkz.external;

public interface Library {
    void open();
    void close();
    void lendBook();

    default void study(){
        System.out.println("Running study in library");
    }
}
