package com.caculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void 계산기는_두_수를_더할_수_있다() {
        // given
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.add(a, b);

        // then
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void 계산기는_두_실수를_더할_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.312321353131239");
        BigDecimal b = new BigDecimal("2.312321353131239");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.add(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3.624642706262478"));
    }
}
