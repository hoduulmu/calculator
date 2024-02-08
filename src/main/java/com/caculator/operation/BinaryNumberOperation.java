package com.caculator.operation;

import java.math.BigDecimal;
import java.util.List;

// 이항 연산을 수행하는 연산을 나타내는 인터페이스
// TODO: 사인, 코사인 함수가 다음 스프린트에 추가될 예정이며 이 때, UnaryNumberOperation 인터페이스를 추가할 예정입니다.
public interface BinaryNumberOperation extends NumberOperation {

    @Override
    default BigDecimal calculateNumbers(List<BigDecimal> numbers) {
        if (numbers.size() != 2) {
            throw new IllegalArgumentException("이항 연산은 두 개의 숫자가 필요합니다.");
        }
        return calculateTwoNumbers(numbers.get(0), numbers.get(1));
    }

    BigDecimal calculateTwoNumbers(BigDecimal operand, BigDecimal secondOperand);
}
