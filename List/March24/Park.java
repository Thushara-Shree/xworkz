package com.xworkz.March24;

public class Park {

    public boolean entry=true;
    String plants="flower plant";
    protected int expense=10000;

    public void Swing(){
        System.out.println("Running Swing in Park");
        System.out.println(expense);
    }

    void SeaSaw(){
        System.out.println("Running seasaw in park");
        RollerCoaster();
    }

    protected  void RollerCoaster(){
        System.out.println("Running roller coaster in park");
    }

}
