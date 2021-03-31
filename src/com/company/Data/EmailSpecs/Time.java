package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Time extends Query {
    int Hour;
    int Minute;
    int Second;

    public Time(
                int Hour, int Minute, int Second) {
       this.Hour = Hour;
       this.Minute = Minute;
       this.Second = Second;
    }
}
