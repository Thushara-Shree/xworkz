package com.xworkz.internal;

public class School {

    private int students;
    private  char sections;
    private int buses;

    public School(int students,char sections,int buses){
        this.students=students;
        this.buses=buses;
        this.sections=sections;
    }

    @Override
    public String toString() {
        return "students:"+this.students+" School bus"+this.buses+ "sections "+this.sections;
    }
}
