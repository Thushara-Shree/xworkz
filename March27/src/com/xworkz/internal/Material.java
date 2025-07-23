package com.xworkz.internal;

public class Material {

    private String materialType;
    private int size;

    public Material(String materialType,int size){
        this.materialType=materialType;
        this.size=size;
    }

    public void displayMaterial(){
        System.out.println("Running displayMaterial in Material");
        System.out.println("The type of material is: "+materialType);
        System.out.println("The size is: "+size);
    }
}
