package com.company.Data;

import com.company.Data.EmailSpecs.Destination;
import com.company.Data.EmailSpecs.Subject;

import java.util.ArrayList;
import java.util.List;

public class Query {

    public static void main (String[]args) {

        Destination d1 = new Destination("vasile@gmail.com", "0", "0");
        Subject s1 = new Subject("lab");
        List<Query> List1 = new ArrayList<Query>();
        List1.add(d1);
        List1.add(s1);
        System.out.println("1(Object Query)" + "\n" + "filterVasile:{to:" + d1.getTo() + "\n" +
                "subject:" + s1.getwords() + "}");

        Destination d2 = new Destination("0", "orange@gmail.com", "0");
        Subject s2 = new Subject("factura");
        List<Query> List2 = new ArrayList<Query>();
        List2.add(d2);
        List2.add(s2);
        System.out.println("\n" + "1(Object Query)" + "\n" + "filterVasile:{to:" + d2.getTo() + "\n" +
                "subject:" + s2.getwords() + "}");

        List<Query> Union = new ArrayList<Query>();
        Union.addAll(List1);
        Union.addAll(List2);

        List<Query> Intersection = new ArrayList<Query>();
        Intersection.retainAll(List1);
        Intersection.retainAll(List2);

    }
}
