package com.currenjin.milkyway.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.time.LocalDateTime;

import static com.currenjin.milkyway.domain.Constant.DATETIME;
import static com.currenjin.milkyway.domain.Constant.PLACE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TimingTest {

    @Test
    void TIMING_은_DATETIME_과_PLACE_를_가진다() {
        Timing actual = Timing.of(DATETIME, PLACE);

        assertThat(actual.getDateTime()).isEqualTo(DATETIME);
        assertThat(actual.getPlace()).isEqualTo(PLACE);
    }

    @ParameterizedTest
    @NullSource
    void TIMING_생성시_유효하지_않은_DATETIME_이면_안된다(LocalDateTime INVALID_VALUE) {
        assertThatThrownBy(() -> Timing.of(INVALID_VALUE, PLACE))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullSource
    void TIMING_생성시_유효하지_않은_PLACE_이면_안된다(Place INVALID_VALUE) {
        assertThatThrownBy(() -> Timing.of(DATETIME, INVALID_VALUE))
                .isInstanceOf(IllegalArgumentException.class);
    }
}