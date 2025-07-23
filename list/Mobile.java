package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Mobile {

    public static void main(String[] args) {

        List<String> mobileName=new ArrayList<>(Arrays.asList("Vivo","Poco","MotoRola","Apple","ReadMi","Real Me","IQOO","Nothing","Samsung","Poco"));

        ListIterator<String> mobileIterator=mobileName.listIterator();

        while (mobileIterator.hasNext()){

            String mobiles=mobileIterator.next();
            System.out.println("Nobile Name :"+mobiles);

            if(mobiles.equals("Poco")){
                mobileIterator.add("Nokia");
            }
        }
        System.out.println("Mobile names are: "+mobileName);

    }
}
