package com.company;

import java.sql.Timestamp;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        String URI = "http://localhost:8080/{0}";
        String req = MessageFormat.format(URI , 10);
        System.out.println(req);
        BusinessUnit b = BusinessUnit.CDDK;
        String sp = "45_Shehroaz";

        System.out.println(sp.substring(sp.indexOf('_') + 1));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(b);
        System.out.println(15 % 5);

    }
}