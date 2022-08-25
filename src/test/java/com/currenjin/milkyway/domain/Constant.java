package com.currenjin.milkyway.domain;

import java.time.LocalDateTime;

public class Constant {
    static final Latitude LATITUDE = Latitude.of(37.6260552599583);
    static final Longitude LONGITUDE = Longitude.of(128.7415367673336);
    static final Place PLACE = Place.of(LATITUDE, LONGITUDE);
    static final LocalDateTime DATETIME = LocalDateTime.of(2022, 8, 25, 11, 24);
}
