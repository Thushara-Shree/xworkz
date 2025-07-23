package com.xworkz.external;

public interface Poco {

    void version();
    void  features();
    void  camera();

    default void pixel(){
        System.out.println("Running pixel in Poco");
    }


}



