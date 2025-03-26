package com.xworkz.intermal;

public class jailRunner {

    public static void main(String[] args) {
        Jail jail=new Jail("Kolkata Cental Jail","Kolkata","Dasappa",25);
        CentralJail centralJail=new CentralJail();

        centralJail.jailName();
        centralJail.jailArray();
        centralJail.jailParameter(jail);

        Jail[] jails=new Jail[2];
         jails[0]=new Jail("Jharkhand Central Jail","Jarkhand","Doobey",17);
         jails[1]=new Jail("Jammu Central Jail","Jammu","Lovely",21);

        centralJail.arrayJailParameter(jails);




        }
    }
