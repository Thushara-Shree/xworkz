package com.xworkz.fitness.sevice;

import com.xworkz.fitness.dto.RegisterDTO;
import com.xworkz.fitness.repository.RegisterRepository;
import com.xworkz.fitness.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public String validateAndSave(RegisterDTO registerDTO) {
        RegisterRepository registerRepository=new RegisterRepositoryImpl();
        registerRepository.save(registerDTO);
        return "Testing";


    }
}
