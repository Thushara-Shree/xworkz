package com.xworkz.March20;

public class Main {

    public static void main(String[] args) {

        Ticket ticket=new Ticket(TicketType.AC,38 00);
        Cricket cricket=new Cricket();
        cricket.watch(ticket);
        cricket.profit(ticket);

        Brush brush=new Brush(Color.BLUE);
        Virat virat=new Virat();
        virat.play(cricket);
        virat.clean(brush);
        virat.relax(ticket);


    }
}
