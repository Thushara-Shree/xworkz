package com.xworkz.intermal;

public class CentralJail {

    public void jailName() {
        System.out.println("Running jailName in Central Jail");
        Jail jail = new Jail("Banglore Central Jail", "Banglore", "Mallikarjuna", 10);
        System.out.println("Jail Name:" + jail.getName());
        System.out.println("Jail Location:"+jail.getLocation());
        System.out.println("Jail Keeper:"+jail.getJailerName());
        System.out.println("Total cell is:"+jail.getTotalCells());

        jail.setName("Mumbai central Jail");
        System.out.println("Updated jail name is:"+jail.getJailerName());
    }

    public void jailArray(){
        System.out.println("Running Jail Array in Cental Jail");

        Jail[] jails=new Jail[2];

         jails[0]=new Jail("Mumbai Central Jail","Mumbai","Devendra",20);
         jails[1]=new Jail("Poojapura Central Jail","Kerala","Venugopal",15);

        for(Jail jail:jails){
            System.out.println("Jail Name:" + jail.getName());
            System.out.println("Jail Location:"+jail.getLocation());
            System.out.println("Jail Keeper:"+jail.getJailerName());
            System.out.println("Total cell is:"+jail.getTotalCells());

        }


    }
    public  void jailParameter(Jail jail){
        System.out.println("Running jail Parameter in Central Jail");
        System.out.println("Jail Name:" + jail.getName());
        System.out.println("Jail Location:"+jail.getLocation());
        System.out.println("Jail Keeper:"+jail.getJailerName());
        System.out.println("Total cell is:"+jail.getTotalCells());

    }

    public void arrayJailParameter(Jail[] jails){
        System.out.println("Running Jail Array Parameter in Central Jail");
        if(jails!=null) {
            for (Jail jail : jails) {
                System.out.println("Jail Name:" + jail.getName());
                System.out.println("Jail Location:" + jail.getLocation());
                System.out.println("Jail Keeper:" + jail.getJailerName());
                System.out.println("Total cell is:" + jail.getTotalCells());

            }
        }
    }
}




