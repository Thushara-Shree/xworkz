package com.xworkz.internal;

public class Bag {

    private int company;
    private  int type;
    private int cost;

    public Bag(int company,int type,int cost){
        this.company=company;
        this.type=type;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "company:"+this.company+" type"+this.type+ "cost "+this.cost;
    }
}
