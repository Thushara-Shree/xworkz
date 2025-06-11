package com.xworkz.general.servlet;

import com.xworkz.general.dto.DrivingLicense;
import com.xworkz.general.service.DeathCertiServ;
import com.xworkz.general.service.DeathCertiServImpl;
import com.xworkz.general.service.DrivingLicServImpl;
import com.xworkz.general.service.DrivingLicenseServ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/drivingLicense", loadOnStartup = 1)
public class DrivingLicenceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String mobile=req.getParameter("mobile");
        String date=req.getParameter("date");
        String type=req.getParameter("type");

        Long mobile1=Long.parseLong(mobile);
        LocalDate date1=LocalDate.parse(date);

        DrivingLicense drivingLicense=new DrivingLicense(name,address,mobile1,date1,type);
        System.out.println("Driving License"+drivingLicense);


        DrivingLicenseServ drivingLicenseServ=new DrivingLicServImpl();
        String result=drivingLicenseServ.validateAndSave(drivingLicense);
        System.out.println(result);



    }
}
