package com.currenjin.milkyway.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LatitudeTest {

    private static final double DOUBLE = 1.1;

    @Test
    void Latitude_는_double_을_가진다() {
        Latitude actual = Latitude.of(DOUBLE);

        assertThat(actual.getValue()).isEqualTo(DOUBLE);
    }
}