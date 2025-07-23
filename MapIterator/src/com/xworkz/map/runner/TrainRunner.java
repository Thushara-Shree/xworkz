package com.xworkz.map.runner;

import com.xworkz.map.dto.TrainDTO;

import java.util.HashMap;
import java.util.Map;

public class TrainRunner {
    public static void main(String[] args) {
        Map<TrainDTO, Integer> trainDto = new HashMap<>();
        trainDto.put(new TrainDTO("Chennai Express",5,"Chennai","Mumbai",8,"sleeper",150,true,53.2,"Express"),769);
        trainDto.put(new TrainDTO("Rajdhani Express", 12431, "Delhi", "Mumbai", 18, "AC", 2200, true, 89.5, "Superfast"), 201);
        trainDto.put(new TrainDTO("Shatabdi Express", 12007, "Bangalore", "Chennai", 12, "AC Chair Car", 1500, true, 85.0, "Shatabdi"), 345);
        trainDto.put(new TrainDTO("Duronto Express", 12213, "Pune", "Nagpur", 14, "Sleeper", 1800, true, 78.6, "Duronto"), 587);
        trainDto.put(new TrainDTO("Vande Bharat Express", 22436, "Varanasi", "Delhi", 16, "Executive", 3000, true, 95.4, "Semi-High Speed"), 912);

        for(Map.Entry<TrainDTO,Integer> entry:trainDto.entrySet()){
            System.out.println("Key: "+entry.getKey()+ "Value: "+entry.getValue() );

        }


    }
}