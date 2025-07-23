package com.xworkz.refandvariable;

public class Security {

    String team;
    int memberCount;
    boolean armed;
    String officer;

    Personnel personnel=new Personnel("Harry",25,5,'B');

    Security(String team,int memberCount,boolean armed,String officer){
        this.team=team;
        this.memberCount=memberCount;
        this.armed=armed;
        this.officer=officer;
    }

    void display(){
        System.out.println("Running display in Security class ");
        System.out.println("the security team is "+this.team+" the number of member is "+this.memberCount+
                "the security is armed "+this.armed+ "The security is for "+this.officer);

        if(personnel!=null) {
            personnel.display();
        }

            System.out.println("The reference is pointing towards null");
        }
    }

