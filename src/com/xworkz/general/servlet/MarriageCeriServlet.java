package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageCerti;
import com.xworkz.general.service.MarriageCertServ;
import com.xworkz.general.service.MarriageCertiServImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/marriagecertificate",loadOnStartup = 1)
public class MarriageCeriServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName=req.getParameter("groomName");
        String brideName=req.getParameter("brideName");
        String location=req.getParameter("location");
        String address=req.getParameter("address");
        String religion=req.getParameter("religion");
        String date=req.getParameter("date");
        String witness1=req.getParameter("witness1");
        String witness2=req.getParameter("witness2");
        String officer=req.getParameter("officer");

        LocalDate date1=LocalDate.parse(date);

        MarriageCerti marriageCerti=new MarriageCerti(groomName,brideName,location,address,date1,religion,witness1,witness2,officer);
        System.out.println("Marriage Certificate"+marriageCerti);

        MarriageCertServ marriageCertServ=new MarriageCertiServImpl();
        String result=marriageCertServ.validateAndSave(marriageCerti);
        System.out.println(result);




    }
}
