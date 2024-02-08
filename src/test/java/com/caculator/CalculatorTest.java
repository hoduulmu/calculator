package com.caculator;

import com.caculator.operation.impl.Divide;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void 계산기는_입력된_연산_기호에_맞게_계산한다() {
        // given
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.calculate(a, b, "+");

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3"));
    }
}
