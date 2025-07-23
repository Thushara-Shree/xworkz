package com.xworkz.external;

public interface Movie {
    void play();
    void pause();
    void stop();

    default void action(){
        System.out.println("Running action in movie");
    }
}

