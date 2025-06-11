package com.xworkz.general.servlet;


import com.xworkz.general.dto.BirthCertificateDTO;
import com.xworkz.general.service.BirthCertificateServImpl;
import com.xworkz.general.service.BirthCertificateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/birthcertificate", loadOnStartup = 1)
public class BirthCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String birthId = servletRequest.getParameter("birth");
        String hospitalName = servletRequest.getParameter("hospitalName");
        String father = servletRequest.getParameter("father");
        String mother = servletRequest.getParameter("mother");
        String date = servletRequest.getParameter("date");
        String doctor = servletRequest.getParameter("doctor");
        String nurse = servletRequest.getParameter("nurse");
        String hospitalType = servletRequest.getParameter("hospitalType");

        int birthId1=Integer.parseInt(birthId);
        LocalDate date1 = LocalDate.parse(date);

      BirthCertificateDTO birthCertificateDTO1=new BirthCertificateDTO(birthId1,hospitalName,father,mother,date1,doctor,nurse,hospitalType);
        System.out.println("Birth Certificate: "+birthCertificateDTO1);

        BirthCertificateService birthCertificateService=new BirthCertificateServImpl();
        String result=birthCertificateService.validateAndSave(birthCertificateDTO1);
        System.out.println(result);





    }
}

