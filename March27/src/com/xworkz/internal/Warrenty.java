package com.xworkz.internal;

public class Warrenty {

    private String startDate;
    private String endDate;

    public Warrenty(String startDate,String endDate){
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public void years(){
        System.out.println("Running years in Warrenty");
        System.out.println("The start Date is: "+startDate);
        System.out.println("The End Date is: "+endDate);


    }
}
