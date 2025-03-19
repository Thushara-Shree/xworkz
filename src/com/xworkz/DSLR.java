package com.xworkz;

public class DSLR {

    public  void lens(Camera camera){
        System.out.println("Running  DSLR  class");
        if(camera!=null){
            camera.capture();
        }
        else{
            System.out.println("Reference is pointing to null");
        }
    }
}
