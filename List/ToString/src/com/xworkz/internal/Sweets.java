package com.xworkz.internal;

public class Sweets {

    private String company;
    private  String taste;
    private int cost;

    public Sweets(String company,String taste,int cost){
        this.company=company;
        this.taste=taste;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "company:"+this.company+" taste"+this.taste+ "cost "+this.cost;
    }
}
