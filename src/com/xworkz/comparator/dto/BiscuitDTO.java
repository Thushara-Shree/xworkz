package com.xworkz.comparator.dto;

public class BiscuitDTO implements Comparable<BiscuitDTO>{

    private int id;
    private String name;

    public BiscuitDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BiscuitDTO{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(BiscuitDTO o) {
       if(o.getid()>this.id){
           return 1;
       } else if (o.getid()==this.id) {
           return 0;

       }
       else
           return -1;
    }

    private int getid() {
        return 0;
    }



}
