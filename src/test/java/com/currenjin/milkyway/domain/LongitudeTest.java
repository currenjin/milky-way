package com.currenjin.milkyway.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongitudeTest {

    private static final double DOUBLE = 1.1;

    @Test
    void Longitude_는_double_을_가진다() {
        Longitude actual = Longitude.of(DOUBLE);

        assertThat(actual.getValue()).isEqualTo(DOUBLE);
    }
}