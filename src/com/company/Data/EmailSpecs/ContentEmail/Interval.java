package com.company.Data.EmailSpecs.ContentEmail;

public class Interval extends Attachment{
    int start;
    int end;

    public Interval(String body, Attachment attachments, boolean isPresent, String word, String fextension,
                    String file, String digit, Interval interval, int start, int end){
        super(body, attachments, isPresent, word, fextension,  file, digit, interval);
        this.start = start;
        this.end = end;
    }
}
