package com.vyrvykhvost.presenters;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Presenter implements PresenterInterface {
    private String lastName;
    private String name;
    private String experience;

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String experience() {
        return experience;
    }
}
