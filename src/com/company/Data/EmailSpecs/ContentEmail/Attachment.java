package com.company.Data.EmailSpecs.ContentEmail;
import com.company.EmailSpecs.Content;

public class Attachment extends Content {
    boolean isPresent;
    String word;
    String fextension;
    String file;
    String digit;
    Interval interval;

    public Attachment(String body, Attachment attachments, boolean isPresent, String word, String fextension,
                      String file, String digit, Interval interval){
        super(body, attachments);
        this.isPresent = isPresent;
        this.word = word;
        this.fextension = fextension;
        this.file = file;
        this.digit = digit;
        this.interval = interval;
    }
}