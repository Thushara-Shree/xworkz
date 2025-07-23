package com.xworkz.external;

public interface Art {
    void draw();
    void paint();
    void sculpt();

    default void create(){
        System.out.println("Running create in art");
    }
}


