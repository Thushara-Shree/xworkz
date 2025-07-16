package com.xworkz.intermal;

public class Camera {

    private String brand;
    private  int price;
    private  CameraType cameraType;
    private String connectivity;

    public String getBrand(){
        return  this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public CameraType getCameraType(){
        return this.cameraType;
    }
    public  String getConnectivity(){
        return this.connectivity;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public void setCameraType(CameraType cameraType){
        this.cameraType=cameraType;
    }
    public void setConnectivity(String connectivity){
        this.connectivity=connectivity;
    }

}
