package com.company.Data;

public class Filter {
    String ID;
    To to;
    Subject subject;

    public Filter(Subject subject) {
        this.subject = subject;
    }
    public Filter() {
        this.ID = null;
        this.to = null;
        this.subject = null;
    }

    public Filter(To to) {
        this.to = to;
    }

    public Filter(To to, Subject subject) {
        this.to = to;
        this.subject = subject;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return ID+ "{"+"\n" +
                "to:" + to.toString() + "\n" +
                "subject:" + subject.toString() + "\n" +
                '}';
    }
}
