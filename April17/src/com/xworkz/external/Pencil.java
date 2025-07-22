package com.xworkz.external;

public interface Pencil {
    void write();
    void erase();
    void sharpen();

    default void sketch(){
        System.out.println("Running sketch in Pencil");
    }
}

