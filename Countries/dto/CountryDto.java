package com.xworkz.country.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class CountryDto implements Serializable {


    private String name;
    private long pinCode;
    private double populationInMillions;
    private int noOfStaes;
    private double massInKms;
    private String primeMinister;
    private String primaryLanguage;
    private String secondaryLanguage;
    private double gdp;
}

