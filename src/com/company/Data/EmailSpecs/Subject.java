package com.company.Data.EmailSpecs;
import com.company.Data.Query;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Query {
    String word;
    List<String> words = new ArrayList<>() ;

    public Subject(List<String> words, String word) {
        this.words = words;
        this.word = word;
    }
}
