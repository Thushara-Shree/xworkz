package com.xworkz.external;

public interface Pen {

    void write();
    void ink();
    void type();

    default void cost(){
        System.out.println("Running cost in Pen");
    }

}
