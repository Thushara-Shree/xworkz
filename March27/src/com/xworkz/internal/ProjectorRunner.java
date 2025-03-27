package com.xworkz.internal;

public class ProjectorRunner {

    public static void main(String[] args) {

        Screw screw=new Screw(10,"Tighten");

        Voltage voltage=new Voltage(67,76);
        Battery battery=new Battery("Exide",'A',voltage);
        Remote remote=new Remote("TV",battery);

        Material material=new Material("Cotton",4);
        Button button=new Button(7,material);

        Capacitor capacitor=new Capacitor(56, 87);
        Board board=new Board("plastic",capacitor);

        Quality quality=new Quality('A',true);
        Wire wire=new Wire("green",quality);

        PortType portType=new PortType(6,true);
        Port port=new Port("USB",portType);

        Warrenty warrenty=new Warrenty("27/6/2024","28/09/2028");
        Lamp lamp=new Lamp("red",warrenty);


        Len len=new Len(608,9000);
        Panel panel=new Panel("steel",8);
        Projector projector=new Projector(len,lamp,port,wire,board,button,panel,remote,screw);
        projector.screen();

    }
}
