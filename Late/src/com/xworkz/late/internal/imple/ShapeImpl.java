package com.xworkz.late.internal.imple;


public class ShapeImpl implements Shape {

    public ShapeImpl() {
        System.out.println("ShapeImpl object created.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}
