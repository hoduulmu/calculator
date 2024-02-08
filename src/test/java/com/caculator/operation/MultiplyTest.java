package com.caculator.operation;

import com.caculator.Calculator;
import com.caculator.operation.impl.Multiply;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplyTest {

    @Test
    void 두_수를_곱할_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.3123");
        BigDecimal b = new BigDecimal("2.444");

        // when
        BigDecimal actual = new Multiply().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3.2072612"));
    }
}
