package com.xworkz.external;

public interface Gold {

    void cost();
    void jewellery();
    void extract();

    default void wear(){
        System.out.println("Running wear in Gold");
    }
}
