package com.currenjin.milkyway.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static com.currenjin.milkyway.domain.Constant.LATITUDE;
import static com.currenjin.milkyway.domain.Constant.LONGITUDE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PlaceTest {

    @Test
    void Place_는_위도와_경도를_가진다() {
        Place actual = Place.of(LATITUDE, LONGITUDE);

        assertThat(actual.getLatitude()).isEqualTo(LATITUDE);
        assertThat(actual.getLongitude()).isEqualTo(LONGITUDE);
    }

    @ParameterizedTest
    @NullSource
    void Place_생성시_위도가_유효하지_않으면_안된다(Latitude INVALID_VALUE) {
        assertThatThrownBy(() -> Place.of(INVALID_VALUE, LONGITUDE))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullSource
    void Place_생성시_경도가_유효하지_않으면_안된다(Longitude INVALID_VALUE) {
        assertThatThrownBy(() -> Place.of(LATITUDE, INVALID_VALUE))
                .isInstanceOf(IllegalArgumentException.class);
    }
}