package com.xworkz.string.runner;

import com.xworkz.string.dto.ContactDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContactRunner {

    public static void main(String[] args) {


        Comparator<ContactDTO> contactDTO=(((o1, o2) -> Integer.compare(o1.getId(),o2.getId())));
        Comparator<ContactDTO> contactDTO1=(((o1, o2) -> Integer.compare(o1.getId(),o2.getId())));
        Comparator<ContactDTO> contactDTO2=(((o1, o2) -> Integer.compare(o1.getId(),(o2.getId()))));

        Comparator<ContactDTO> comparator=(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        Comparator<ContactDTO> comparator1=Comparator.comparing(ContactDTO::getName).thenComparing(ContactDTO::getEmail);
        Comparator<ContactDTO> comparator2 =Comparator.comparing(ContactDTO::getPhone).thenComparing(ContactDTO::getName);
        Comparator<ContactDTO> comparator3 =Comparator.comparing(ContactDTO::getDob);

        List<ContactDTO> contacts=new ArrayList<>();

        contacts.add(new ContactDTO(1, "Frank", "frank61@company.org", 9876392214L, LocalDate.of(1991, 7, 21)));
        contacts.add(new ContactDTO(2, "Alice", "alice.baker@company.org", 9823456789L, LocalDate.of(1990, 5, 12)));
        contacts.add(new ContactDTO(3, "Bob", "bob.smith@company.org", 9811122233L, LocalDate.of(1988, 11, 3)));
        contacts.add(new ContactDTO(4, "Cathy", "cathy.jones@company.org", 9844556677L, LocalDate.of(1993, 2, 28)));
        contacts.add(new ContactDTO(5, "David", "david.lee@company.org", 9887766554L, LocalDate.of(1985, 6, 30)));
        contacts.add(new ContactDTO(6, "Ella", "ella.davis@company.org", 9876543210L, LocalDate.of(1992, 8, 19)));
        contacts.add(new ContactDTO(7, "George", "george.hill@company.org", 9833221100L, LocalDate.of(1987, 9, 15)));
        contacts.add(new ContactDTO(8, "Hannah", "hannah.green@company.org", 9898989898L, LocalDate.of(1994, 4, 25)));
        contacts.add(new ContactDTO(9, "Ian", "ian.moore@company.org", 9822334455L, LocalDate.of(1989, 12, 5)));
        contacts.add(new ContactDTO(10, "Jane", "jane.adams@company.org", 9870011223L, LocalDate.of(1991, 1, 1)));
        contacts.add(new ContactDTO(11, "Kyle", "kyle.brown@company.org", 9801122334L, LocalDate.of(1986, 3, 11)));
        contacts.add(new ContactDTO(12, "Laura", "laura.wilson@company.org", 9812233445L, LocalDate.of(1990, 7, 9)));
        contacts.add(new ContactDTO(13, "Mark", "mark.evans@company.org", 9823344556L, LocalDate.of(1984, 10, 13)));
        contacts.add(new ContactDTO(14, "Nina", "nina.hall@company.org", 9834455667L, LocalDate.of(1995, 5, 7)));
        contacts.add(new ContactDTO(15, "Oscar", "oscar.king@company.org", 9845566778L, LocalDate.of(1993, 6, 18)));
        contacts.add(new ContactDTO(16, "Paula", "paula.scott@company.org", 9856677889L, LocalDate.of(1992, 3, 22)));
        contacts.add(new ContactDTO(17, "Quinn", "quinn.morgan@company.org", 9867788990L, LocalDate.of(1988, 8, 8)));
        contacts.add(new ContactDTO(18, "Rita", "rita.bennett@company.org", 9878899001L, LocalDate.of(1987, 2, 14)));
        contacts.add(new ContactDTO(19, "Steve", "steve.collins@company.org", 9889900112L, LocalDate.of(1991, 9, 29)));
        contacts.add(new ContactDTO(20, "Tina", "tina.ward@company.org", 9891011223L, LocalDate.of(1986, 11, 6)));

        System.out.println("1.Sort By Integer");
        contacts.stream().sorted(contactDTO).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");


        System.out.println("2. Asc");
        contacts.stream().sorted(contactDTO1).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");

        System.out.println("2. Dsc");
        contacts.stream().sorted(contactDTO2).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");

        System.out.println("3.Sort by String");
        contacts.stream().sorted(comparator).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");

        System.out.println("3.Sort by name and email");
        contacts.stream().sorted(comparator1).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");


        System.out.println("4.sort by ph and name");
        contacts.stream().sorted(comparator2).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------");

        System.out.println("5.sort by date");
        contacts.stream().sorted(comparator3).forEach(e-> System.out.println(e));
    }
}
