package com.company.Data;

import java.util.ArrayList;

public class To {
    ArrayList<String> list = new ArrayList<>();

    public To(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return list.get(0);

    }
}
