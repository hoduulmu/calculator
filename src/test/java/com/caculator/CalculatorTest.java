package com.caculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void 계산기는_입력된_연산_기호에_맞게_계산한다() {
        // given
        String input = "1 + 2";
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = calculator.calculate(input);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3"));
    }

    @Test
    void 계산기는_지원하지_않는_연산_기호를_입력하면_예외를_던진다() {
        // given
        String input = "1 x 2";
        Calculator calculator = new Calculator();

        // when
        // then
        assertThatThrownBy(() -> calculator.calculate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("지원하지 않는 연산자입니다.");
    }

    @Test
    void 계산기는_지원하지_않는_형식을_입력하면_예외를_던진다() {
        // given
        String input = "1 + 2;;;";
        Calculator calculator = new Calculator();

        // when
        // then
        assertThatThrownBy(() -> calculator.calculate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
