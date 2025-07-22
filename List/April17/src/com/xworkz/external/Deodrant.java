package com.xworkz.external;

public interface Deodrant {

    void smell();
    void  cost();
    void  gas();

    default void fragrance(){
        System.out.println("Running fragrance in Deodrant");
    }

}
