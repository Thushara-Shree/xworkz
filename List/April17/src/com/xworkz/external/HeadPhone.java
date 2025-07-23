package com.xworkz.external;

public interface HeadPhone{
    void playMusic();
    void adjustVolume();
    void connect();

    default void  ear(){
        System.out.println("Running default method");
    }
}

