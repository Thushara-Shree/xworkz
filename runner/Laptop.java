package com.xworkz.collection.runner;

import com.xworkz.collection.dto.LaptopDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Laptop {

    public static void main(String[] args) {


        Collection<LaptopDTO> laptops=new ArrayList<>();
        laptops.add(new LaptopDTO("Dell", "Inspiron 15", 8, 512, "Intel i5", 15.6, 58990.00));
        laptops.add(new LaptopDTO("HP", "Pavilion x360", 16, 1024, "Intel i7", 14.0, 75990.00));
        laptops.add(new LaptopDTO("Lenovo", "IdeaPad Slim 3", 8, 256, "AMD Ryzen 5", 15.6, 45999.00));
        laptops.add(new LaptopDTO("Apple", "MacBook Air M2", 8, 512, "Apple M2", 13.6, 114900.00));
        laptops.add(new LaptopDTO("Asus", "ROG Strix G15", 16, 1024, "AMD Ryzen 7", 15.6, 99999.00));
        laptops.add(new LaptopDTO("Acer", "Aspire 5", 8, 512, "Intel i5", 15.6, 52999.00));
        laptops.add(new LaptopDTO("MSI", "Modern 14", 16, 512, "Intel i7", 14.0, 64999.00));
        laptops.add(new LaptopDTO("Samsung", "Galaxy Book3", 16, 512, "Intel i5", 15.6, 74999.00));
        laptops.add(new LaptopDTO("Microsoft", "Surface Laptop 5", 16, 512, "Intel i7", 13.5, 112999.00));
        laptops.add(new LaptopDTO("LG", "Gram 14", 16, 512, "Intel i7", 14.0, 99990.00));


        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getBrand());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getModel());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getRamSize());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getStorageSize());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getProcessor());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getScreenSize());
        }

        for (LaptopDTO laptop1: laptops){
            System.out.println(laptop1.getPrice());
        }


    }
}
