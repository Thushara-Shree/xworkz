package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.BiscuitDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiscuitRunner {

    public static void main(String[] args) {

        List<BiscuitDTO> biscuitDTOS=new ArrayList<>();
        biscuitDTOS.add(new BiscuitDTO(55,"Hide & Seek"));
        biscuitDTOS.add(new BiscuitDTO(89,"Parle G"));
        biscuitDTOS.add(new BiscuitDTO(57,"Marie Gold"));
        biscuitDTOS.add(new BiscuitDTO(1,"Dark Fantasy"));

        biscuitDTOS.forEach(e-> System.out.println(e));

        System.out.println("------------------");

        Collections.sort(biscuitDTOS);

        biscuitDTOS.forEach(o-> System.out.println(o));
    }
}
