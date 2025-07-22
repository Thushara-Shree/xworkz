package com.xworkz.external;

import com.xworkz.internal.Bucket;

public class Tray extends Bucket {

    public Tray () {
        super();
        System.out.println("Running Tray   const");
    }

    public void color(){
        System.out.println("Running color in Tray");
    }

    public void buy(){
        System.out.println("Running buy in Tray");
    }

    public void sell(){
        System.out.println("Running sell in Tray");
    }

    public void wash(){
        System.out.println("Running wash in Tray");
    }
    public void price(){
        System.out.println("Running price in Tray");
    }

    public void hold(){
        System.out.println("Running hold in Tray");
    }
}
