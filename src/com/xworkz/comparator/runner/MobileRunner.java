package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileRunner {

    public static void main(String[] args) {

        List<MobileDTO> list=new ArrayList<>();
        list.add(new MobileDTO(55,"MotoRola"));
        list.add(new MobileDTO(8,"Poco"));
        list.add(new MobileDTO(79,"Samsung"));
        list.add(new MobileDTO(1,"Vivo"));


        list.forEach(e-> System.out.println(e));

        System.out.println("--------------------------");

        Collections.sort(list);

        list.forEach(e-> System.out.println(e));
    }
}
