package com.xworkz.external;

public interface Bag {

    void carry();
    void weight();
    void  color();

    default void plastic(){
        System.out.println("Running plastic in Bag");
    }


}
