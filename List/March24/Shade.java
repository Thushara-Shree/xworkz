package com.xworkz.March24;

public class Shade {

    Color color;

    public Shade(Color color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Running displayColor in Shade");
        if (this.color != null) {
            this.color.red();
            System.out.println("The shade of color which belongs to light category is: "+this.color.lightcolor);
        }
    }

    public void runColor() {
        System.out.println("Running runColor in Shade");
        if (this.color != null) {
            this.color.violet();
            System.out.println("The shade of color which belongs to dark category is: "+this.color.darkcolor);
        }
    }
}
