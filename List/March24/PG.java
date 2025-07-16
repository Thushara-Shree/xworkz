package com.xworkz.March24;

public class PG {

    public String location="Banglore";
    int fees=6000;
    protected int doorNo=6;

    public void floor(){
        System.out.println("Running floor in PG");
        wifi();
    }

    void meal(){
        System.out.println("Running meal in PG");
        System.out.println("The door no is:"+doorNo);
    }

    protected void wifi(){
        System.out.println("Running wifi in PG");
    }
}
