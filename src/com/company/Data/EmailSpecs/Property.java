package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Property extends Query {
    boolean forwarded;
    boolean read;

    public Property(boolean forwarded, boolean read) {
        this.forwarded = forwarded;
        this.read = read;

    }
}
