package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.FaceWashDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FaceWashRunner {

    public static void main(String[] args) {

        List<FaceWashDTO> list=new ArrayList<>();
        list.add(new FaceWashDTO(67,"Himalaya"));
        list.add(new FaceWashDTO(89,"Acne Star"));
        list.add(new FaceWashDTO(62,"Ponds"));
        list.add(new FaceWashDTO(6,"Charcoal"));

        list.forEach(e-> System.out.println(e));

        System.out.println("-----------------");

        Collections.sort(list);

        list.forEach(o-> System.out.println(o));
    }
}
