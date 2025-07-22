package com.xworkz.intermal;

public class Jail {

    private String name;
    private  String location;
    private  String jailerName;
    private int totalCells;

    public Jail(String name,String location,String jailerName,int totalCells){
        this.name=name;
        this.location=location;
        this.jailerName=jailerName;
        this.totalCells=totalCells;
    }

    //Accessor
    public String getName(){
        return  this.name;

    }

    public String getLocation(){
        return  this.location;

    }

    public String getJailerName(){
        return  this.jailerName;

    }

    public int getTotalCells(){
        return  this.totalCells;

    }
    //mutators
    public void setName(String name){
        this.name=name;

    }

    public void setLocation(String location){
        this.location=location;

    }

    public void setJailerName(String jailerName){
        this.jailerName=jailerName;

    }

    public void setTotalCells(int totalCells){
        this.totalCells=totalCells;

    }

}
