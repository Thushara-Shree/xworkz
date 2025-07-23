package com.xworkz.external;
public interface Road {
    void construct();
    void maintain();
    void closeForRepairs();

    default void merge(){
        System.out.println("Running merge in Road");
    }
}

