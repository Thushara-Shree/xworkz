package com.xworkz.late.external.user;


import com.xworkz.late.internal.imple.Shape;

public class ShapeUser {
    private Shape shape;

    public ShapeUser(Shape shape) {
        this.shape = shape;
    }

    public void useShape() {
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Shape is not initialized.");
        }
    }
}