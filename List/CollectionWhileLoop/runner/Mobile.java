package com.xworkz.collection.runner;

import com.xworkz.collection.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mobile {


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


        Iterator<MobileDTO> mobile=mobiles.iterator();
        while (mobile.hasNext())
        {
            System.out.println(mobile.next());
        }
    }
}
