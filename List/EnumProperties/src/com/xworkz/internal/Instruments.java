package com.xworkz.internal;

public enum Instruments {

    KEYBOARD(45700,'A'),
    GUITAR(76500,'B');

    private int cost;
    private char chord;

    private Instruments(int cost,char chord){
        this.cost=cost;
        this.chord=chord;
    }
    public int getCost(){
        return  this.cost;
    }

    public char getChord(){
        return  this.chord;
    }
    }




