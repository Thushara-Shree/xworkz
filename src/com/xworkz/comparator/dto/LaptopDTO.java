package com.xworkz.comparator.dto;

public class LaptopDTO implements Comparable<LaptopDTO>{

    private int id;
    private String Brand;

    public LaptopDTO(int id, String brand) {
        this.id = id;
        this.Brand = brand;
    }

    @Override
    public String toString() {
        return "LaptopDTO{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(LaptopDTO other) {

        if(other.getid()>this.id){
            return 1;
        } else if (other.getid()==this.id) {
            return 0;
        }else{
            return -1;
        }
    }


    private int getid() {
        return id;
    }
}
