package com.xworkz.intermal;

public class Satellite {

    private Type type;
    private int cost;
    private int weight;
    private int loadCapacity;




    public Type getType(){
        return this.type;
    }

    public int getCost(){
        return this.cost;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getLoadCapacity(){
        return this.loadCapacity;
    }

    public void setType(Type type){
        this.type=type;
    }

    public void setCost(int cost){
        this.type=type;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity=loadCapacity;
    }

}
