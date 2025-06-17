package com.xworkz.fitness.repository;

import com.xworkz.fitness.dto.RegisterDTO;
import com.xworkz.fitness.sevice.RegisterService;

public interface RegisterRepository {

    String save(RegisterDTO registerDTO);
}
