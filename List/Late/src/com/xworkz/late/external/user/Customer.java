package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Market;
import com.xworkz.late.internal.imple.MarketImpl;

public class Customer {

    Market market;

    public  Customer(Market market){
        this.market=market;
        System.out.println("Running Customer const");
    }

    public  void sell(){
        if (this.market!=null){
            this.market.buy();
        }
        else
        {
            System.out.println("Null");
        }
    }
}
