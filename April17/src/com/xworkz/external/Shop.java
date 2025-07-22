package com.xworkz.external;

public interface Shop {

    void purchase();
    void  coupen();
    void sell();

    default void merchant(){
        System.out.println("Running merchant in shop");
    }
}
