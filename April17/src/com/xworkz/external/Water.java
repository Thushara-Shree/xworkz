package com.xworkz.external;

public interface Water {
    void boil();
    void freeze();
    void flow();

    default void taste(){
        System.out.println("Running taste in Water");
    }
}


