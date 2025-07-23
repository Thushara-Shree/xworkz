package com.xworkz.comparator.dto;

public class FaceWashDTO implements Comparable<FaceWashDTO>{

    private int id;
    private String name;

    public FaceWashDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "FaceWashDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(FaceWashDTO o) {
        if(o.getid()>this.id){
            return 1;
        } else if (o.getid()==this.getid()) {
            return 0;

        }else
            return -1;
    }

    private int getid() {
        return id;
    }
}
