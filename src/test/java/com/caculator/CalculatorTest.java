package com.caculator;

import com.caculator.operation.impl.Add;
import com.caculator.operation.impl.Divide;
import com.caculator.operation.impl.Multiply;
import com.caculator.operation.impl.SubTract;
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
        BigDecimal actual = new Add().calculateTwoNumbers(a, b);

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
        BigDecimal actual = new Add().calculateTwoNumbers(a, b);

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
        BigDecimal actual = new SubTract().calculateTwoNumbers(a, b);

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
        BigDecimal actual = new Multiply().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3.2072612"));
    }

    @Test
    void 계산기는_두_수를_나눌_수_있다() {
        // given
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("2");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = new Divide().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("2.5"));
    }

    @Test
    void 계산기는_두_수를_나눌_수_있고_계산기의_최대_스케일_범위를_넘어서지_않는다() {
        // given
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("3");
        Calculator calculator = new Calculator();

        // when
        BigDecimal actual = new Divide().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("0.33333333333"));
    }

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
