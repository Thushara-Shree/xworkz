package com.xworkz.intermal;

public class Alien {

    private String seenby;
    private String seenDate;
    private String describe;

    public Alien(String seenby,String seenDate, String describe){
        this.seenby=seenby;
        this.seenDate=seenDate;
        this.describe=describe;
    }

    public String getSeenby(){
        return this.seenby;
    }

    public String getSeenDate(){
        return this.seenDate;
    }

    public String getDescribe(){
        return  this.describe;
    }

    public void setSeenby(String seenby){
        this.seenby=seenby;
    }

    public  void setSeenDate(String seenDate){
        this.seenDate=seenDate;
    }

    public void setDescribe(String describe){
        this.describe=describe;
    }
}
