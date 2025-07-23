package com.xworkz.refandvariable;

public class PersonalAssistant {

    String name;
    int age;
    int experience;
    String head;

    PersonalAssistant(String name,int age,int  experience,String head){
        this.name=name;
        this.age=age;
        this.experience=experience;
        this.head=head;
}
    void display(){
        System.out.println("Running display in PA class");
        System.out.println("name is " + this.name + " his age is " + this.age + "having experience "+this.experience+
                "protecting " + this.head);
    }
}