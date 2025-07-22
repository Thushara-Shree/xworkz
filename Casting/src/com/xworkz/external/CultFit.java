package com.xworkz.external;


import com.xworkz.internal.FitnessBrand;

public class CultFit extends FitnessBrand {

    public CultFit() {
        super();
        System.out.println("Running  CultFit  const");
    }

    public void set(){
        System.out.println("Running plugIn in CultFit");
    }

    public void buy(){
        System.out.println("Running remove in CultFit");
    }

    public void sell(){
        System.out.println("Running color in CultFit");
    }

    public void gift(){
        System.out.println("Running price in CultFit");
    }
    public void price(){
        System.out.println("Running capacity in CultFit");
    }

    public void body(){
        System.out.println("Running body in CultFit");
    }
}
