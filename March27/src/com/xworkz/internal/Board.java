package com.xworkz.internal;

public class Board {

    private String boardType;
    private Capacitor capacitor;

    public Board(String boardType,Capacitor capacitor){
        this.boardType=boardType;
        this.capacitor=capacitor;
    }

    public void displayBoard(){
        System.out.println("Running displayBoard in Board");
        System.out.println("The type of board is: "+this.boardType);
        this.capacitor.displayCapacitor();
    }
}
