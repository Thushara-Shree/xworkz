package com.xworkz.internal;

public class Hair {

    private String type;
    private  String shampoo;
    private String cut;

    public Hair(String type,String shampoo,String cut){
        this.type=type;
        this.shampoo=shampoo;
        this.cut=cut;
    }

    @Override
    public String toString() {
        return "type:"+this.type+" shampoo"+this.shampoo+ "number "+this.cut;
    }
}
