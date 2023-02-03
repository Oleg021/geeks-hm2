package com.vyrvykhvost.stream;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Advertising implements PaidStream {
    private String name;
    private double continuance;


    public Double continuance() {
        return continuance;
    }

    public String name() {
        return name;
    }

    public Double price() {
        return continuance() * 5.0;
    }
}
