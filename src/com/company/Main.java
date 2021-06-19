package com.company;

import java.text.MessageFormat;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        String URI = "http://localhost:8080/{0}";
        String req = MessageFormat.format(URI , 10);
        System.out.println(req);
        BusinessUnit b = BusinessUnit.NO;
       // sp stands for Super Power
        String sp = "007_Israel";

        System.out.println(sp.substring(sp.indexOf('_') + 1));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(b);
        System.out.println(15 % 5);
        enumTest(BusinessUnit.Pakistan);
    }

    public static void enumTest(BusinessUnit businessUnit){
        System.out.println(businessUnit);
    }
}
