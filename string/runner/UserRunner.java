package com.xworkz.string.runner;

import com.xworkz.string.dto.UserDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserRunner {

    public static void main(String[] args) {
        Comparator<UserDTO> DTO = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));

        Comparator<UserDTO> DTO1 = ((o1, o2)->Integer.compare(o1.getId(), o2.getId()));
        Comparator<UserDTO> DTO2 = ((o1, o2)->Integer.compare(o2.getId(), o1.getId()));

        Comparator<UserDTO> comparator = ((o1,o2)->o1.getName().compareTo(o2.getName()));
        Comparator<UserDTO> comparator1 =Comparator.comparing(UserDTO::getName).thenComparing(UserDTO::getEmail);
        Comparator<UserDTO> comparator2 =Comparator.comparing(UserDTO::getPhone).thenComparing(UserDTO::getName);

        List<UserDTO> users=new ArrayList<>();

        users.add(new UserDTO(1, "Alice", "alice@example.com", 9876543210L, true));
        users.add(new UserDTO(2, "Bob", "bob@example.com", 9876543211L, false));
        users.add(new UserDTO(3, "Charlie", "charlie@example.com", 9876543212L, true));
        users.add(new UserDTO(4, "Diana", "diana@example.com", 9876543213L, true));
        users.add(new UserDTO(5, "Ethan", "ethan@example.com", 9876543214L, false));
        users.add(new UserDTO(6, "Fiona", "fiona@example.com", 9876543215L, true));
        users.add(new UserDTO(7, "George", "george@example.com", 9876543216L, true));
        users.add(new UserDTO(8, "Hannah", "hannah@example.com", 9876543217L, false));
        users.add(new UserDTO(9, "Ivan", "ivan@example.com", 9876543218L, true));
        users.add(new UserDTO(10, "Jane", "jane@example.com", 9876543219L, true));
        users.add(new UserDTO(11, "Kevin", "kevin@example.com", 9876543220L, false));
        users.add(new UserDTO(12, "Laura", "laura@example.com", 9876543221L, true));
        users.add(new UserDTO(13, "Mike", "mike@example.com", 9876543222L, true));
        users.add(new UserDTO(14, "Nina", "nina@example.com", 9876543223L, false));
        users.add(new UserDTO(15, "Oscar", "oscar@example.com", 9876543224L, true));
        users.add(new UserDTO(16, "Penny", "penny@example.com", 9876543225L, true));
        users.add(new UserDTO(17, "Quinn", "quinn@example.com", 9876543226L, false));
        users.add(new UserDTO(18, "Ruth", "ruth@example.com", 9876543227L, true));
        users.add(new UserDTO(19, "Steve", "steve@example.com", 9876543228L, true));
        users.add(new UserDTO(20, "Tina", "tina@example.com", 9876543229L, false));


        System.out.println("1.Sort By Integer");
        users.stream().sorted(DTO).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");


        System.out.println("2. Asc");
        users.stream().sorted(DTO1).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("2. Dsc");
        users.stream().sorted(DTO2).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("3.Sort by String");
        users.stream().sorted(comparator).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("3.Sort by name and email");
        users.stream().sorted(comparator1).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");


        System.out.println("4.sort by ph and name");
        users.stream().sorted(comparator2).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");
    }
}
