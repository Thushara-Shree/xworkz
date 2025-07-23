package com.xworkz.internal;

public class Screw {
    private int noOfScrew;
    private String task;

    public Screw(int noOfScrew,String task){
        this.noOfScrew=noOfScrew;
        this.task=task;
    }
    public void displayScrew(){
        System.out.println("Running displayScrew in Screw");
        System.out.println("No of screw is: "+this.noOfScrew);
        System.out.println("The task of screw is: "+this.task);
    }

}
