package com.xworkz.fitness.sevice;

import com.xworkz.fitness.dto.RegisterDTO;

public interface RegisterService {

    String validateAndSave(RegisterDTO registerDTO);
}
