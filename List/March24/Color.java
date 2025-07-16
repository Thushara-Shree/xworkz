package com.xworkz.March24;

public class Color {
    public String lightcolor="pink";
    String darkcolor="black";
    protected String festival="holi";

    public void red(){
        System.out.println("Running Red in Color");
        orange();

    }

     void violet(){
        System.out.println("Running violet in Color");
         System.out.println("The festival of Colors is: "+festival);
    }

    private void orange(){
        System.out.println("Running Orange in Color");
    }

}
