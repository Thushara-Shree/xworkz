package com.xworkz.external;

import com.xworkz.internal.Cash;

public class Fee extends Cash {

    public Fee(){
        super();
        System.out.println("Running Fee const");
    }

    public void  euro(){
        System.out.println("Running euro in Fee");
    }

    public void rupee(){
        System.out.println("Running rupee in Fee");
    }

    public void dollar(){
        System.out.println("Running dollar in Fee");
    }

    public void yen(){
        System.out.println("Running yen in Fee");
    }

    public void  cash(){
        System.out.println("Running cash in Fee");
    }

    public void  coin(){
        System.out.println("Running coin in Fee");
    }
}
