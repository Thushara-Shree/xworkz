package com.xworkz.internal;

public class Panel {

    private String panelType;
    private int no;

    public Panel(String panelType,int no){
        this.panelType=panelType;
        this.no=no;
    }

    public void displayPanel(){
        System.out.println("Running displayPanel in Panel");
        System.out.println("The type of panel is: "+panelType);
        System.out.println("Number of panels is: "+no);
    }

}
