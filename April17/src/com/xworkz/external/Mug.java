package com.xworkz.external;

public interface Mug {
    void fill();
    void drink();
    void clean();

    default void  hold(){
        System.out.println("Running default method");
    }
}
