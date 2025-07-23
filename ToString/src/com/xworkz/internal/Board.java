package com.xworkz.internal;

public class Board {

    private int chalk;
    private  int marker;
    private int number;

    public Board(int chalk,int marker,int number){
        this.chalk=chalk;
        this.marker=marker;
        this.number=number;
    }

    @Override
    public String toString() {
        return "chalk:"+this.chalk+" marker"+this.marker+ "number "+this.number;
    }
}
