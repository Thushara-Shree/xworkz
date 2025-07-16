package com.xworkz.external;

import com.xworkz.internal.Board;

public class WhiteBoard extends Board {

    public WhiteBoard(){
        super();
        System.out.println("Running WhiteBoard const");
    }

    public void write(){
        System.out.println("Running write in WhiteBoard");
    }

    public void teach(){
        System.out.println("Running teach in WhiteBoard");
    }

    public void erase(){
        System.out.println("Running erase in WhiteBoard");
    }

    public void duster(){
        System.out.println("Running duster in WhiteBoard");
    }

    public void marker(){
        System.out.println("Running marker in WhiteBoard");
    }

    public void clean(){
        System.out.println("Running claen in WhiteBoard");
    }
}
