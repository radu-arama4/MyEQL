package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Sorting extends Query {
    Enum parameter;
    Enum sortvalue;

    public Sorting(Enum parameter, Enum sortvalue) {
        this.parameter = parameter;
        this.sortvalue = sortvalue;
    }
}
