package com.xworkz.external;

import com.xworkz.internal.Music;

public class Studio extends Music {

    public Studio(){
        super();
        System.out.println("Running const Studio");
    }

    public void musicType(){
        System.out.println("Running musicType in Studio ");
    }

    public void classical(){
        System.out.println("Running classical in Studio ");
    }

    public void rockMusic(){
        System.out.println("Running rockMusic in Studio ");
    }

    public void metal(){
        System.out.println("Running metal in Studio ");
    }

    public void band(){
        System.out.println("Running  band in Music ");

    }
}
