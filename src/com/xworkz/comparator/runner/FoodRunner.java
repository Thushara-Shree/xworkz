package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.FoodDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodRunner {

    public static void main(String[] args) {

        List<FoodDTO> list=new ArrayList<>();
        list.add(new FoodDTO(1,"Biriyani"));
        list.add(new FoodDTO(86,"Dosa"));
        list.add(new FoodDTO(77,"Chappati"));
        list.add(new FoodDTO(91,"Pulav"));

        list.forEach(e-> System.out.println(e));

        System.out.println("-------------------------");

        Collections.sort(list);

        list.forEach(e-> System.out.println(e));
    }
}
