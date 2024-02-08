package com.caculator.operation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BinaryNumberOperationTest {

    @Test
    void 이항_연산에_2개_이상의_숫자를_입력하면_예외를_던진다() {
        // given
        BinaryNumberOperation binaryNumberOperation = (operand, secondOperand) -> null;
        List<String> threeNumbers = List.of("1", "2", "3");

        // when
        // then
        assertThatThrownBy(() -> binaryNumberOperation.calculate(threeNumbers))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
