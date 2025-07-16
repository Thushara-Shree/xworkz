package com.xworkz.country.repository;

import com.xworkz.country.dto.CountryDto;

import java.util.Collection;

public interface CommonRepository {

    Collection<CountryDto> findByAll();
}
