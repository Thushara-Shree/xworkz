package com.xworkz.comparator.dto;

public class StateDTO implements Comparable<StateDTO>{
    private int id;
    private String name;


    public StateDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StateDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StateDTO o) {
        if (o.getid()>this.id){
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
