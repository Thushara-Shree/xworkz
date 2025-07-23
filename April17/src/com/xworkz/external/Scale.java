package com.xworkz.external;

public interface Scale {
    void calibrate();
    void weigh();
    void reset();

    default void measure(){
        System.out.println("Running measure in Scale");
    }
}

