package com.xworkz.string.dto;

import lombok.*;

import java.time.LocalDate;
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class ContactDTO {

    private int id;
    private String name;
    private String email;
    private long phone;
    private LocalDate dob;


}
