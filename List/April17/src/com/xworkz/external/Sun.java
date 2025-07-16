package com.xworkz.external;

public interface Sun {
    void shine();
    void set();
    void rise();

    default void  ray(){
        System.out.println("Running default method");
    }
}
