package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.ShampooDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShampooRunner {

    public static void main(String[] args) {

        List<ShampooDTO> list=new ArrayList<>();
        list.add(new ShampooDTO(89,"Biotic"));
        list.add(new ShampooDTO(68,"Clinic Plus"));
        list.add(new ShampooDTO(33,"Neil"));
        list.add(new ShampooDTO(99,"Simple"));


        list.forEach(e-> System.out.println(e));


        System.out.println("---------------------");

        Collections.sort(list);

        list.forEach(o-> System.out.println(o));

    }
}
