package com.xworkz.stream.runner;

import com.xworkz.stream.repo.CountryRepoImplementation;
import com.xworkz.stream.repo.CountryRepository;

import java.util.Collection;
import java.util.Comparator;

public class CountryRunner {


    public static void main(String[] args){
        CountryRepository countryRepository=new CountryRepoImplementation();
        Collection<String> collection=countryRepository.findAll();

        System.out.println("196 Country names");
        collection.stream().forEach((name)->System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name->name.startsWith("I"))
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name-> name.startsWith("G"))
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter((name) -> name.toLowerCase().endsWith("a"))
                .forEach(name -> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .sorted()
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name->name.length()>6)
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name->name.length()<=4)
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name->name.toLowerCase().contains("o"))
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name -> name.toLowerCase()
                        .chars()
                        .distinct()
                        .count() < name.length())
                .forEach(name-> System.out.println(name));

        System.out.println("---------------------------------------");

        collection.stream()
                .peek(name -> System.out.println(new StringBuilder(name).reverse()))
                .count();

        System.out.println("---------------------------------------");

        collection.stream()
                .filter(name -> name.equalsIgnoreCase(new StringBuilder(name).reverse().toString()))
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        collection.stream()
                .forEach(name -> System.out.println(name + " - " + name.length()));

        System.out.println("---------------------------------------");









    }
}
