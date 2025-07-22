package com.xworkz.external;

public interface Cartoon {
    void draw();
    void animate();
    void display();

    default  void watch(){
        System.out.println("Running watch in cartoon");
    }
}
