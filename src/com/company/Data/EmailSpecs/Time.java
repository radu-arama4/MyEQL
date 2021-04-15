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

    public int getHour() {
        return Hour;
    }

    public void Hour(int Hour) {
        this.Hour = Hour;
    }

    public int getMinute() {
        return Minute;
    }

    public void Minute(int Minute) {
        this.Minute = Minute;
    }

    public int getSecond() {
        return Second;
    }

    public void Second(int Second) {
        this.Second = Second;
    }
}
