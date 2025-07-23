package com.xworkz.refandvariable;

public class Portfolio {

    String name;
    int experince;
    String role;
    String specilisation;

    Portfolio(String name,int experince,String role,String specilisation){
        this.name=name;
        this.experince=experince;
        this.role=role;
        this.specilisation=specilisation;
        System.out.println("The name of person is "+this.name+" The experince is "+this.experince+
                "the role is "+this.role+ "The specilisation is "+this.specilisation);
    }

    void display(){
        System.out.println("Running display in Portfolio class ");
    }
}
