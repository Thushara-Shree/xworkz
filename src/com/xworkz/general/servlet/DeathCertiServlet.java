package com.xworkz.general.servlet;


import com.xworkz.general.dto.DeathCertiDTO;
import com.xworkz.general.service.DeathCertiServ;
import com.xworkz.general.service.DeathCertiServImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/deathcertificate", loadOnStartup=1)
public class DeathCertiServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String cause =req.getParameter("cause");
        String date =req.getParameter("date");
        String time =req.getParameter("time");
        String age =req.getParameter("age");
        String doctor =req.getParameter("doctor");
        String hospital=req.getParameter("hospital");
        String manner=req.getParameter("manner");
        String gender=req.getParameter("gender");
        String marks=req.getParameter("marks");

        LocalDate date1=LocalDate.parse(date);
        LocalTime time1=LocalTime.parse(time);
        int age1=Integer.parseInt(age);

        DeathCertiDTO deathCertiDTO=new DeathCertiDTO(name,cause,date1,time1,age1,doctor,hospital,manner,gender,marks);
        System.out.println("Death Certificate"+deathCertiDTO);

        DeathCertiServ deathCertiServ=new DeathCertiServImpl();
        String result=deathCertiServ.validateAndSave(deathCertiDTO);
        System.out.println(result);


    }
}

