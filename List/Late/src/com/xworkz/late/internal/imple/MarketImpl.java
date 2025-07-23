package com.xworkz.late.internal.imple;

public class MarketImpl implements Market{

    public MarketImpl(){
        super();
        System.out.println("Running MarketImpl const");
    }

    @Override
    public void buy() {
        System.out.println("Running buy in MarketImpl");
    }
}
