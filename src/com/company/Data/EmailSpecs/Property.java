package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Property extends Query {
    boolean forwarded;
    boolean read;

    public Property(boolean forwarded, boolean read) {
        this.forwarded = forwarded;
        this.read = read;
    }

    public boolean getforwarded() {
        return forwarded;
    }

    public void setforwarded(boolean forwarded) {
        this.forwarded = forwarded;
    }

    public boolean getread() {
        return read;
    }

    public void setread(boolean read) {
        this.read = read;
    }
}
