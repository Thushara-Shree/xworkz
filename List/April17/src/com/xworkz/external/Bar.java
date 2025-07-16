package com.xworkz.external;

public interface Bar {
    void serveDrink();
    void playMusic();
    void clean();

    default void  beer(){
        System.out.println("Running default method");
    }
}
