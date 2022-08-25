package com.currenjin.milkyway.domain;

public class Longitude {

    private final double value;

    private Longitude(double value) {
        this.value = value;
    }

    public static Longitude of(double value) {
        return new Longitude(value);
    }

    public double getValue() {
        return this.value;
    }
}
