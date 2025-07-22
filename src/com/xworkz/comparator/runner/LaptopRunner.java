package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.LaptopDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {

    public static void main(String[] args) {

        List<LaptopDTO> lists=new ArrayList<>();
        lists.add(new LaptopDTO(45,"Lenovo"));
        lists.add(new LaptopDTO(8,"Dell"));
        lists.add(new LaptopDTO(97,"HP"));
        lists.add(new LaptopDTO(79,"Acer"));

        lists.forEach(s-> System.out.println(s));

        System.out.println("----------------");

        Collections.sort(lists);

        lists.forEach(e-> System.out.println(e));


    }
}
