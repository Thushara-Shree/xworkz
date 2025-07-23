package com.xworkz.refandvariable;

public class Minister {

    String name;
    String status;
    int age;
    String type;
    PersonalAssistant personalAssistant=new PersonalAssistant("Promada Kumar Mishra",76,21,"Narendra Modi");
    Security security=new Security("NSG ",48,true,"Ministry of Home Affairs");
    Portfolio[] portfolio=new Portfolio[]{
            new Portfolio("Rajnath Singh",10,"Minister of defence","Defence"),
            new Portfolio("Amit Shah",7,"Minister of Home Affairs","Corportaion")
    };

    House house=new House("Rajya Sabha",250,"Protecting States culture and Interest","Vice-President");
    State[] state=new State[]{
            new State("Karnataka",'S',"Siddaramaiah",19.217),
            new State("Tamil Nadu",'S',"M K Stalin",50.216)
    };

     Minister(String name,String status,int age,String state) {
        this.name = name;
        this.status = status;
        this.age = age;
        this.type = state;
        System.out.println("name is " + this.name + ".The role paid is " + this.status + "The age is " + this.age +
                "The state is " + this.type);

    }

    void display(){
        System.out.println("running display in minister class");
        personalAssistant.display();
        security.display();
        for(Portfolio ref:portfolio){
            ref.display();
        }
        house.display();
        for(State ref2:state){
            ref2.display();
        }


    }

}
