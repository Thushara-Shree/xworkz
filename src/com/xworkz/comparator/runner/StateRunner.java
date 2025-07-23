package com.xworkz.comparator.runner;

import com.xworkz.comparator.dto.StateDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StateRunner {

    public static void main(String[] args) {

        List<StateDTO> list=new ArrayList<>();
        list.add(new StateDTO(57,"Kerala"));
        list.add(new StateDTO(86,"Karnataka"));
        list.add(new StateDTO(79,"Goa"));
        list.add(new StateDTO(6,"Telangana"));

        list.forEach(r-> System.out.println(r));

        System.out.println("----------------");

        Collections.sort(list);

        list.forEach(r-> System.out.println(r));




    }
}
