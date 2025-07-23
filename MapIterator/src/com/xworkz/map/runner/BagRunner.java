package com.xworkz.map.runner;

import com.xworkz.map.dto.BagDTO;

import java.util.HashMap;
import java.util.Map;

public class BagRunner {

    public static void main(String[] args) {

        Map<BagDTO, Integer> bagDTO=new HashMap<>();
        bagDTO.put(new BagDTO("WildCraft","green","polythene",2500,6,true,3,4,"Carry Bag","Continous"),48);
        bagDTO.put(new BagDTO("Skybags", "blue", "nylon", 3200, 8, true, 4, 3.5, "Backpack", "Standard"), 12);
        bagDTO.put(new BagDTO("American Tourister", "black", "polyester", 2800, 10, true, 5, 4.2, "Laptop Bag", "Heavy-duty"), 25);
        bagDTO.put(new BagDTO("F Gear", "red", "canvas", 1800, 5, false, 2, 2.9, "Messenger Bag", "Smooth"), 33);
        bagDTO.put(new BagDTO("Aristocrat", "grey", "leather", 4500, 7, true, 3, 5.1, "Duffel Bag", "Ziplock"), 60);

        for(Map.Entry<BagDTO,Integer> entry:bagDTO.entrySet()){
            System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue());
        }
    }
}
