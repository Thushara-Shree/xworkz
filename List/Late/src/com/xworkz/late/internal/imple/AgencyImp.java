package com.xworkz.late.internal.imple;

public class AgencyImp implements Agency{

    public AgencyImp(){
        super();
        System.out.println("Running AgencyImp const");
    }

    @Override
    public void fly() {
        System.out.println("Running fly in AgencyImp");
    }
}
