package com.xworkz.refandvariable;

public class Country {

    String flag;
    String currency;
    int states;
    String continent;

    PrimeMinister primeMinister;

    public Country(String flag,String currency ,int states,String continent)
    {
        this.flag=flag;
        this.currency=currency;
        this.states=states;
        this.continent=continent;
        this.primeMinister=new PrimeMinister("Narendra Modi","India",74,'M');

    }

    void display(){
        System.out.println("Running display method in Country class");
        System.out.println("flag of country is "+this.flag+" currency is "+this.currency+" number of states is "+this.states+
                "present in continent "+this.continent);

        if(primeMinister!=null){
            primeMinister.display();
        }
        else
            System.out.println("The refernce is pointing towards null");
    }



}

