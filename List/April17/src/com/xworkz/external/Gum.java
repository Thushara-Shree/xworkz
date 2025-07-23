package com.xworkz.external;

public interface Gum {
    void chew();
    void blowBubble();
    void spitOut();

    default void bite(){
        System.out.println("Running bite in gum");
    }
}

