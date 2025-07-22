package com.xworkz.collection.runner;

<<<<<<< HEAD
=======
import com.xworkz.collection.dto.MobileDTO;

>>>>>>> 274e881 (Collection DTO)
import java.util.ArrayList;
import java.util.Collection;

public class Mobile {

<<<<<<< HEAD
    public static void main(String[] args){

        Collection<String> brands=new ArrayList<>();
        brands.add("Samsung");
        brands.add("Motorola");
        brands.add("Poco");
        brands.add("Nokia");
        brands.add("Apple");
        brands.add("Vivo");
        brands.add("Oppo");
        brands.add("Xiomi");
        brands.add("Redmi");
        brands.add("Realme");

        System.out.println("The size is: "+brands.size());

        brands.clear();
        System.out.println("The size after clearing: "+brands.size());

        brands.add("Samsung");
        brands.add("Motorola");
        brands.add("Poco");
        brands.add("Nokia");
        brands.add("Apple");
        brands.add("Vivo");
        brands.add("Oppo");
        brands.add("Xiomi");
        brands.add("Redmi");
        brands.add("Realme");
        System.out.println("The updated size is: "+brands.size());

=======

    public static void main(String[] args) {

        Collection<MobileDTO> mobiles=new ArrayList<>();
        mobiles.add(new MobileDTO("Samsung", "Galaxy S23", "Android", 8, 256, 6.1, 79999.00));
        mobiles.add(new MobileDTO("Apple", "iPhone 14", "iOS", 6, 128, 6.1, 69999.00));
        mobiles.add(new MobileDTO("OnePlus", "11R", "Android", 8, 256, 6.74, 39999.00));
        mobiles.add(new MobileDTO("Xiaomi", "Redmi Note 13 Pro", "Android", 8, 128, 6.67, 21999.00));
        mobiles.add(new MobileDTO("Realme", "Narzo 60 Pro", "Android", 12, 256, 6.7, 23999.00));
        mobiles.add(new MobileDTO("Motorola", "Edge 40", "Android", 8, 128, 6.55, 26999.00));
        mobiles.add(new MobileDTO("Vivo", "V29 Pro", "Android", 12, 256, 6.78, 36999.00));
        mobiles.add(new MobileDTO("Oppo", "Reno10", "Android", 8, 256, 6.7, 32999.00));
        mobiles.add(new MobileDTO("Nothing", "Phone 2", "Android", 12, 256, 6.7, 44999.00));
        mobiles.add(new MobileDTO("Google", "Pixel 7a", "Android", 8, 128, 6.1, 43999.00));

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getBrand());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getModel());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getOperatingSystem());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getRamSize());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getStorageSize());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getScreenSize());
        }
        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getBrand());
        }

        for (MobileDTO mobile1:mobiles){
            System.out.println(mobile1.getPrice());
        }
>>>>>>> 274e881 (Collection DTO)

    }
}
