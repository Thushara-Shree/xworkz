package com.xworkz.string.runner;

import com.xworkz.string.dto.ContactDTO;
import com.xworkz.string.dto.EmailDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmailRunner {

    public static void main(String[] args) {

        Comparator<EmailDTO> emailDTO=((o1, o2) -> Integer.compare(o1.getId(),(o2.getId())));
        Comparator<EmailDTO> emailDTO1=((o1, o2) -> Integer.compare(o1.getId(),(o2.getId())));
        Comparator<EmailDTO> emailDTO2=((o1, o2) -> Integer.compare(o1.getId(),(o2.getId())));

        Comparator<EmailDTO> comparator = ((o1,o2)->o1.getEmailAddress().compareTo(o2.getEmailAddress()));
        Comparator<EmailDTO> comparator1 =Comparator.comparing(EmailDTO::getEmailAddress).thenComparing(EmailDTO::getDomain);
        Comparator<EmailDTO> comparator2 =Comparator.comparing(EmailDTO::getDomain);




        List<EmailDTO> emails=new ArrayList<>();


        emails.add(new EmailDTO(1, "alice@example.com", "example.com", true, "Admin"));
        emails.add(new EmailDTO(2, "bob@sample.org", "sample.org", false, "System"));
        emails.add(new EmailDTO(3, "cathy@test.net", "test.net", true, "Cathy"));
        emails.add(new EmailDTO(4, "dan@company.com", "company.com", true, "HR"));
        emails.add(new EmailDTO(5, "ella@mydomain.io", "mydomain.io", false, "Ella"));
        emails.add(new EmailDTO(6, "frank@services.biz", "services.biz", true, "Frank"));
        emails.add(new EmailDTO(7, "george@alpha.org", "alpha.org", true, "George"));
        emails.add(new EmailDTO(8, "hannah@beta.io", "beta.io", false, "Automation"));
        emails.add(new EmailDTO(9, "ian@charlie.dev", "charlie.dev", true, "DevOps"));
        emails.add(new EmailDTO(10, "jane@echo.com", "echo.com", false, "Jane"));
        emails.add(new EmailDTO(11, "kevin@delta.org", "delta.org", true, "Admin"));
        emails.add(new EmailDTO(12, "lisa@omega.io", "omega.io", false, "Lisa"));
        emails.add(new EmailDTO(13, "mark@fusion.tech", "fusion.tech", true, "Mark"));
        emails.add(new EmailDTO(14, "nina@zenith.net", "zenith.net", true, "Nina"));
        emails.add(new EmailDTO(15, "oliver@matrix.ai", "matrix.ai", false, "Oliver"));
        emails.add(new EmailDTO(16, "paul@hyperloop.biz", "hyperloop.biz", true, "System"));
        emails.add(new EmailDTO(17, "quincy@nova.com", "nova.com", true, "Quincy"));
        emails.add(new EmailDTO(18, "rachel@quantum.org", "quantum.org", false, "Rachel"));
        emails.add(new EmailDTO(19, "steve@datahub.net", "datahub.net", true, "Steve"));
        emails.add(new EmailDTO(20, "tina@virtual.dev", "virtual.dev", false, "Tina"));


        System.out.println("1.Sort By Integer");
        emails.stream().sorted(emailDTO).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");


        System.out.println("2. Asc");
        emails.stream().sorted(emailDTO1).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("2. Dsc");
        emails.stream().sorted(emailDTO2).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("3.Sort by String");
        emails.stream().sorted(comparator).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("3.Sort by name and email");
        emails.stream().sorted(comparator1).forEach(e-> System.out.println(e));
        System.out.println("-----------------------");

        System.out.println("3.Sort by domain");
        emails.stream().sorted(comparator2).forEach(e-> System.out.println(e));
    }
}
