package com.xworkz.external;

import com.xworkz.internal.LivingBeing;

public class Man extends LivingBeing {

    public Man(){
        super();
        System.out.println("Running Man const");
    }

    public void breath(){
        System.out.println("Running breath in Man");
    }

    public void eat(){
        System.out.println("Running eat in Man");
    }

    public void sleep(){
        System.out.println("Running sleep in Man");
    }

    public void talk(){
        System.out.println("Running talk in Man");
    }

    public void help(){
        System.out.println("Running help in Man");
    }

    public void walk(){
        System.out.println("Running walk in Man");
    }
}
