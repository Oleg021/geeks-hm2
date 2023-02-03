package com.vyrvykhvost.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Interview implements PaidStream {
    private String nameGuest;
    private double continuance;

    public Double continuance() {
        return continuance;
    }

    public String name() {
        return nameGuest;
    }

    public Double price() {
        return continuance() * 30.0;
    }
}
