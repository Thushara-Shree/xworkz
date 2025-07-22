package com.xworkz.external;

public interface Cupboard {
    void open();
    void close();
    void organize();

    default void material(){
        System.out.println("Running material in Cupboard");
    }
}

