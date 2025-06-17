package com.xworkz.fitness.sevlet;


import com.xworkz.fitness.dto.RegisterDTO;
import com.xworkz.fitness.sevice.RegisterService;
import com.xworkz.fitness.sevice.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Register", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age= req.getParameter("age");
        String number= req.getParameter("number");
        String email= req.getParameter("email");
        String bloodGrp= req.getParameter("bloodGrp");
        String address= req.getParameter("address");
        String city= req.getParameter("city");
        String interested= req.getParameter("interested");

        int age1=Integer.parseInt(age);
        boolean interested1= Boolean.parseBoolean(interested);
        Long number1=Long.parseLong(number);

        RegisterDTO registerDTO=new RegisterDTO(name,age1,number1,email,bloodGrp,address,city,interested1);
        System.out.println("Registration Details: "+registerDTO);


        RegisterService registerService=new RegisterServiceImpl();
        String result=registerService.validateAndSave(registerDTO);
        System.out.println(result);




    }
}
