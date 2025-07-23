package com.xworkz.refandvariable;

public class Personnel {

    String name;
    int age;
    int exp;
    char bloodGrp;

    Personnel(String name,int age,int exp,char bloodGrp){
        this.name=name;
        this.age=age;
        this.exp=exp;
        this.bloodGrp=bloodGrp;
        System.out.println("The name of person is "+this.name+" The age is "+this.age+
                "the experince is "+this.exp+ "The bloodGrp is "+this.bloodGrp);
    }

    void display(){
        System.out.println("Running display in personnel ");
    }

}
