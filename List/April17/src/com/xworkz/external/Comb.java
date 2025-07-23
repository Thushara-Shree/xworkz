package com.xworkz.external;

public interface Comb {
    void untangle();
    void style();
    void clean();

    default void  comb(){
        System.out.println("Running comb in Comb");
    }
}

