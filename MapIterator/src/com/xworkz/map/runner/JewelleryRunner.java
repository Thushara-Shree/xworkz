package com.xworkz.map.runner;

import com.xworkz.map.dto.JewelleryDTO;

import java.util.HashMap;
import java.util.Map;

public class JewelleryRunner {

    public static void main(String[] args) {


        Map<JewelleryDTO, Integer> jewelleryDTO = new HashMap<>();
        jewelleryDTO.put(new JewelleryDTO("necklace","gold",40,"diamond",500000),567);
        jewelleryDTO.put(new JewelleryDTO("ring", "platinum", 10, "ruby", 120000), 102);
        jewelleryDTO.put(new JewelleryDTO("earrings", "silver", 15, "emerald", 45000), 309);
        jewelleryDTO.put(new JewelleryDTO("bracelet", "gold", 22, "none", 95000), 221);
        jewelleryDTO.put(new JewelleryDTO("bangle", "rose gold", 35, "sapphire", 185000), 488);


        for(Map.Entry<JewelleryDTO,Integer> entry:jewelleryDTO.entrySet() ){
            System.out.println("Key : "+entry.getKey()+" "+ "value : "+entry.getValue());
        }

    }
}