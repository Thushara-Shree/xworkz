package com.xworkz.comparator.dto;

public class MobileDTO implements Comparable<MobileDTO>{

    private int id;
    private String name;

    @Override
    public String toString() {
        return "MobileDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public MobileDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(MobileDTO o) {
        if(o.getid()<this.id){
            return 1;
        } else if (o.getid()==this.id) {

            return 0;

        }else
            return -1;

    }

    private int getid() {
        return id;
    }
}
