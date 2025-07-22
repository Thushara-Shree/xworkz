package com.xworkz.internal;

public class Cash {

    public void displayCustomer(){
        System.out.println("Runing display Customer in Cash");
        Customer customer=new Customer();
        customer.setName("Ron Weasely");
        customer.setCardNo(127);

        System.out.println("The name of cutomer is: "+customer.getName());
        System.out.println("The card number is: "+customer.getCardNo());


    }

      void displayATM(){
        System.out.println("Running displayATM in cash");
        ATM atm=new ATM();
        atm.setAtmNo("45UC6712");
        atm.setCode(8576);

        System.out.println("The atm code is: "+atm.getAtmNo());
          System.out.println("The Bank Code is "+atm.getCode());
    }
}
