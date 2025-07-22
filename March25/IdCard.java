package com.xworkz.intermal;

public class IdCard {

    private String material;
    private String[] color;
    private int weight;
    private String designed_by;

    public String getMaterial(){
        return this.material;
    }

    public String[] getColor(){
        return this.color;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getDesigned_by(){
        return  this.designed_by;
    }
    public void setMaterial(String material){
        this.material=material;

    }

    public void setColor(String[] color){
        this.color=color;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public void setDesigned_by(String designed_by){
        this.designed_by=designed_by;
    }


}
