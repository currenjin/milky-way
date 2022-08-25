package com.currenjin.milkyway.domain;

public class Latitude {

    private final double value;

    private Latitude(double value) {
        this.value = value;
    }

    public static Latitude of(double value) {
        return new Latitude(value);
    }

    public double getValue() {
        return this.value;
    }
}
