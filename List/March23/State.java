package com.xworkz.refandvariable;

public class State {

    String name;
    char location;
    String minister;
    double area;

    State(String name, char location,String minister,double area){
        this.name=name;
        this.location=location;
        this.minister=minister;
        this.area=area;

        System.out.println("name is  " + this.name + " his location is " + this.location + "the Chief Minister is "+this.minister+
                "The area is " + this.area);
    }

    void display(){
        System.out.println("Running display in State");
    }

}
