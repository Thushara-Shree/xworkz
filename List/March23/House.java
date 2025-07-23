package com.xworkz.refandvariable;

public class House {
    String name;
    int members;
    String role;
    String head;


    House(String name,int members,String role,String head){
        this.name=name;
        this.members=members;
        this.role=role;
        this.head=head;

        System.out.println("name is " + this.name + ".The number of member is " + this.members + "The role is " + this.role +
                "The head is  " + this.head);

    }
    void display(){
        System.out.println("Running display in House");
    }
}
