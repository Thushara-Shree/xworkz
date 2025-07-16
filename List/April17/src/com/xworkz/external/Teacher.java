package com.xworkz.external;

public interface Teacher {
    void teach();
    void grade();
    void giveHomework();

    default void help(){
        System.out.println("Running help in Teacher");
    }
}

