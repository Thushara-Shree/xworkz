package com.xworkz.March20;

public class Ticket {

    TicketType type;
    double cost;

    Ticket(TicketType type,double cost){
        this.type=type;
        System.out.println("The type of journey is "+type);
        this.cost=cost;
        System.out.println("The cost of ticket is  "+cost);
    }


    void buy(){
        System.out.println("Running buy method in Ticket class");

    }

    void sell(){
        System.out.println("Running sell method in Ticket class");



    }
}
