package com.xworkz.March20;

public class Cricket {

    Ticket ticket;

    void watch(Ticket ticket){
        System.out.println("Running watch method in Cricket class");

        if(ticket!=null){
            ticket.buy();
        }

        else
            System.out.println("Reference is pointing to null memory ");

    }

    void profit(Ticket ticket){
        System.out.println("Running profit in Cricket class");

        if(ticket!=null){
            ticket.sell();
        }

        else
            System.out.println("Reference is pointing to null");
    }
    }


