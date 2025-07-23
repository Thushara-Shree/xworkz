package com.xworkz.external;
public interface Social {
    void interact();
    void organizeEvent();
    void helpOthers();

    default void subject(){
        System.out.println("Running subject in Social");
    }
}
