package com.xworkz.comparator.dto;

public class SnacksDTO implements Comparable<SnacksDTO>{

    private int id;
    private String name;

    public SnacksDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SnacksDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(SnacksDTO o) {
        if(o.getid()>this.getid()){
            return 1;
        }else if(o.getid()==this.getid()){
            return 0;
        }else
            return -1;
    }

    private int getid() {
        return id;
    }
}
