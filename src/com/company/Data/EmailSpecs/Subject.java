package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Subject extends Query {
    String words;

    public Subject(String words) {
        this.words = words;
    }

    public String getwords() {
        return words;
    }

    public void setwords(String words) {
        this.words = words;
    }
}
