package com.xworkz.external;
import com.xworkz.internal.Purse;

public class Money extends Purse {

    public Money(){
        super();
        System.out.println("Running const Money");
    }
    public void currency(){
        System.out.println("Running currency in Money");
    }
}
