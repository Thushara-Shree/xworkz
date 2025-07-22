package com.xworkz.country.runner;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.repository.CommonRepository;
import com.xworkz.country.repository.CommonRepositoryImpl;
import lombok.*;

import java.util.Collection;
import java.util.Optional;


public class CountryRunner {

    public static void main(String[] args){
        CommonRepository commonRepository=new CommonRepositoryImpl();
        Collection<CountryDto> collection=commonRepository.findByAll();

        System.out.println("All countries");
        collection.forEach((dto)-> System.out.println(dto));

        System.out.println("---------------------------------------------------------------");
        System.out.println("All the countries ending with 'a'");
        collection.stream().filter((name)->name.getName().toLowerCase().endsWith("a")).forEach((dto)-> System.out.println(dto));

        System.out.println("---------------------------------------------------------------");
        System.out.println("All the countries starting with R");
        collection.stream().filter((name)->name.getName().toLowerCase().startsWith("r")).forEach((dto)-> System.out.println(dto));

        System.out.println("---------------------------------------------------------------");
        System.out.println("Country by pinCode");
        collection.stream().filter(dto-> 2550== dto.getPinCode()).forEach(dto-> System.out.println("Pin Code : "+dto.getName()));

        System.out.println("--------------------------------------------------------");
        System.out.println("   Find a optional country by primeMinister");
        Optional<CountryDto> countryDto = collection.stream().filter(dto->"Pedro Sánchez".equalsIgnoreCase(dto.getPrimeMinister())).findFirst();
        if(countryDto.isPresent()){
            System.out.println("CountryName :"+countryDto.get().getName());


            System.out.println("--------------------------------------------------------");
            System.out.println("Find all countries where mass between");
            collection.stream().filter(dto->dto.getMassInKms()>=10000000 && dto.getMassInKms()<=20000000).forEach(dto-> System.out.println("Country Name "+dto.getName()));

            System.out.println("--------------------------------------------------------");
            System.out.println("Find all country where primary lang is english");
            collection.stream().filter(dto->"english".equalsIgnoreCase(dto.getPrimaryLanguage())).forEach(dto-> System.out.println(dto.getName()));

            System.out.println("--------------------------------------------------------");
            System.out.println("Find optional by noOfStates > than");
            collection.stream().filter(dto->dto.getNoOfStaes() >10).forEach(dto-> System.out.println(dto.getName()));
        }


    }


}
