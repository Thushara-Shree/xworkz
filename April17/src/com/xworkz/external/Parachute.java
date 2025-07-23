package com.xworkz.external;

public interface Parachute {

    void smell();
    void quality();
    void  use();

    default void fly(){
        System.out.println("Running fly in Prachute");
    }
    
}
