package com.vyrvykhvost.presenters;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Guest implements GuestInterface {
    private String lastName;
    private String name;
    private String resume;

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String resume() {
        return resume;
    }
}
