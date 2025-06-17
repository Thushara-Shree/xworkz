package com.xworkz.fitness.repository;

import com.xworkz.fitness.dto.RegisterDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImpl implements RegisterRepository{

    @Override
    public String save(RegisterDTO registerDTO) {
        System.out.println("Running Repository in db");
        System.out.println("WARN: Connected to db");

        try {
            //Load & Register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ko19rom";
            String username="root";
            String password="Xworkzodc@123";
            //STEP 2: Create a connection
            Connection connection=DriverManager.getConnection(url,username,password);
            //STEP 3: Prepare the statement
            String sql="insert into fitness values(0,'"+registerDTO.getName()+"',"+registerDTO.getAge()+",'"+registerDTO.getNumber()+"','"+registerDTO.getEmail()+"','"+registerDTO.getBloodGrp()+"','"+registerDTO.getAddress()+"','"+registerDTO.getCity()+"',"+registerDTO.isSubscription()+")";
            Statement statement=connection.createStatement();
            //STEP4: Execute the Statement
            statement.executeUpdate(sql);
            System.out.println("Connection:"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "";
    }
}
