package com.xworkz.comparator.dto;

public class ShampooDTO implements Comparable<ShampooDTO>{

    private int productId;
    private String name;

    public ShampooDTO(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShampooDTO{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ShampooDTO o) {
        if(o.getproductId()>this.productId){
            return 1;
        } else if (o.getproductId()==this.productId) {
            return 0;
        }
        else
            return -1;
    }

    public int getproductId() {
        return productId;
    }
}
