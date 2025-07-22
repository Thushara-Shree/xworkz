package com.xworkz.internal;

import com.xworkz.external.Paper;
import com.xworkz.external.Rock;

public class Game implements Paper, Rock {

    @Override
    public void write() {
        System.out.println("Running in Game");
    }

    @Override
    public void recycle() {
        System.out.println("Running in Game");
    }

    @Override
    public void roll() {
        System.out.println("Running in Game");
    }

    @Override
    public void stack() {
        System.out.println("Running in Game");
    }

    @Override
    public void tear() {
        System.out.println("Running in Game");
    }

    @Override
    public void breakIntoPieces() {
        System.out.println("Running in Game");
    }


}
