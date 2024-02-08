package com.caculator.operation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberOperationTest {

    @Test
    void 숫자_연산에_숫자가_아닌_문자를_입력하면_예외를_던진다() {
        // given
        NumberOperation numberOperation = operand -> null;
        List<String> notNumber = List.of("notNumber");

        // when
        // then
        assertThatThrownBy(() -> numberOperation.calculate(notNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자만 입력해주세요.");
    }
}
