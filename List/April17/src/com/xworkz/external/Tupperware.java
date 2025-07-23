package com.xworkz.external;

public interface Tupperware {

    void plastic();
    void pet();
    void cost();

    default void store(){
        System.out.println("Running store in Tupperware");
    }


}
