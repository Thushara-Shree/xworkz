package com.xworkz.internal;

public class Quality {

    private char grade;
    private boolean approval;

    public Quality(char grade,boolean approval){
        this.grade=grade;
        this.approval=approval;
    }
    public void displayQuality(){
        System.out.println("Running displayQuality in Quality");
        System.out.println("The grade is: "+grade);
        System.out.println("The state of approval is: "+approval);
    }

}
