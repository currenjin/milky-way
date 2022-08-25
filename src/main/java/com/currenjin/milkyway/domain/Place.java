package com.currenjin.milkyway.domain;

public class Place {


    private final Latitude latitude;
    private final Longitude longitude;

    private Place(Latitude latitude, Longitude longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Place of(Latitude latitude, Longitude longitude) {
        validate(latitude, longitude);

        return new Place(latitude, longitude);
    }

    private static void validate(Latitude latitude, Longitude longitude) {
        if (latitude == null) {
            throw new IllegalArgumentException("Invalid latitude for a place");
        }

        if (longitude == null) {
            throw new IllegalArgumentException("Invalid longitude for a place");
        }
    }

    public Latitude getLatitude() {
        return latitude;
    }

    public Longitude getLongitude() {
        return longitude;
    }
}
