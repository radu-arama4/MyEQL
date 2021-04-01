package com.company.Data.EmailSpecs;
import com.company.Query;

public class Destination extends Query {
    String To;
    String From;
    String CC;

    public Destination(String To, String From, String CC) {
        this.To = To;
        this.From = From;
        this.CC = CC;
    }
}
