package com.caculator.operation;

import com.caculator.operation.impl.Divide;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class DivideTest {

    @Test
    void 두_수를_나눌_수_있다() {
        // given
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");

        // when
        BigDecimal actual = new Divide().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("2.5"));
    }

    @Test
    void 두_수를_나눌_수_있고_최대_스케일_범위를_넘어서지_않는다() {
        // given
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("3");

        // when
        BigDecimal actual = new Divide().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("0.33333333333"));
    }
}
