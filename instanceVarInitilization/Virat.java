package com.xworkz.March20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Virat {

    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    void play(Cricket cricket){
        System.out.println("Running play method in Virat");

        if(this.cricket!=null){
           this.cricket.watch(ticket);
           this.cricket.profit(ticket);
        }
        else
            System.out.println("The reference is pointing towards null memory ");
    }

    void clean(Brush brush){
        System.out.println("Running clean in Virat Class");

        if(this.brush!=null){
            brush.clean();
            brush.scrub();
        }
        else
            System.out.println("The reference is pointing towards null");
    }

    void relax(Ticket ticket){
        System.out.println("Running relax in Virat class");
        if(ticket!=null){
            ticket.buy();
            ticket.sell();
        }
        else
            System.out.println("The reference is pointing towards null");

    }


}
