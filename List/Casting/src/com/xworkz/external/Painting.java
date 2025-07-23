package com.xworkz.external;

import com.xworkz.internal.Art;

public class Painting extends Art {

    public Painting() {
        super();
        System.out.println("Running Painting const");
    }

    public void create(){
        System.out.println("Running create in Painting");
    }

    public void sell(){
        System.out.println("Running sell in Painting ");
    }

    public void buy(){
        System.out.println("Running buy in Painting");
    }

    public void frame(){
        System.out.println("Running frame in Painting");
    }

    public void fix(){
        System.out.println("Running fix in Painting");
    }

    public void brush(){
        System.out.println("Running brush in Painting");
    }
}
