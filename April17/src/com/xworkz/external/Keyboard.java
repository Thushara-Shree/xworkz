package com.xworkz.external;

public interface Keyboard {
    void type();
    void pressKey();
    void clean();

    default void keys(){
        System.out.println("Running keys in Keyboard");
    }
}

