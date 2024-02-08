package com.caculator.operation;

import com.caculator.operation.impl.Add;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class AddTest {

    @Test
    void 두_수를_더할_수_있다() {
        // given
        BigDecimal a = BigDecimal.ONE;
        BigDecimal b = BigDecimal.valueOf(2);

        // when
        BigDecimal actual = new Add().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(BigDecimal.valueOf(3));
    }

    @Test
    void 두_실수를_더할_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.312321353131239");
        BigDecimal b = new BigDecimal("2.312321353131239");

        // when
        BigDecimal actual = new Add().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("3.624642706262478"));
    }
}
