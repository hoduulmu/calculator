package com.caculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void 계산기는_두_수를_더할_수_있다() {
        // given
        BigDecimal a = BigDecimal.ONE;
        BigDecimal b = BigDecimal.valueOf(2);
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.add(a, b);

        // then
        assertThat(actual).isEqualTo(BigDecimal.valueOf(3));
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

    @Test
    void 계산기는_두_수를_뺄_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.312321353131239");
        BigDecimal b = new BigDecimal("2.444");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.subtract(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("-1.131678646868761"));
    }

    @Test
    void 계산기는_두_수를_곱할_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.3123");
        BigDecimal b = new BigDecimal("2.444");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.multiply(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3.2072612"));
    }
}
