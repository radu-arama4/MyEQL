package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Destination extends Query {
    String To;
    String From;
    String CC;

    public Destination(String To, String From, String CC) {
        this.To = To;
        this.From = From;
        this.CC = CC;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }
}
