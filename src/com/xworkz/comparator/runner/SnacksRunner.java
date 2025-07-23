package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.SnacksDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SnacksRunner {

    public static void main(String[] args) {

        List<SnacksDTO> list=new ArrayList<>();
        list.add(new SnacksDTO(1,"Chips"));
        list.add(new SnacksDTO(89,"Biscuits"));
        list.add(new SnacksDTO(76,"Wafers"));
        list.add(new SnacksDTO(99,"Chakkuli"));

        list.forEach(e-> System.out.println(e));

        System.out.println("-----------------------------");

        Collections.sort(list);

        list.forEach(e-> System.out.println(e));



    }
}
