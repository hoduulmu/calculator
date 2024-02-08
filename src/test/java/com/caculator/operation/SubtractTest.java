package com.caculator.operation;

import com.caculator.operation.impl.Subtract;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class SubtractTest {

    @Test
    void 두_수를_뺄_수_있다() {
        // given
        BigDecimal a = new BigDecimal("1.312321353131239");
        BigDecimal b = new BigDecimal("2.444");

        // when
        BigDecimal actual = new Subtract().calculateTwoNumbers(a, b);

        // then
        assertThat(actual).isEqualTo(new BigDecimal("-1.131678646868761"));
    }
}
