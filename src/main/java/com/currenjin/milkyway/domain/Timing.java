package com.currenjin.milkyway.domain;

import java.time.LocalDateTime;

public class Timing {

    private final Place place;
    private final LocalDateTime dateTime;

    private Timing(LocalDateTime dateTime, Place place) {
        this.dateTime = dateTime;
        this.place = place;

    }

    public static Timing of(LocalDateTime dateTime, Place place) {
        validate(dateTime, place);

        return new Timing(dateTime, place);
    }

    private static void validate(LocalDateTime dateTime, Place place) {
        if (dateTime == null) {
            throw new IllegalArgumentException("Invalid date time for a timing");
        }

        if (place == null) {
            throw new IllegalArgumentException("Invalid place for a timing");
        }
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public Place getPlace() {
        return this.place;
    }
}
