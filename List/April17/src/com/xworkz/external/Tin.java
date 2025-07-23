package com.xworkz.external;

public interface Tin {

    void store();
    void use();
    void  cost();
    default void  crush(){
        System.out.println("Running crush in Tin");
    }

}
