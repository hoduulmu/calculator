package com.caculator.operation;

import java.math.BigDecimal;
import java.util.List;

// 숫자 연산을 수행하는 연산을 나타내는 인터페이스
// TODO: 미적분 연산이 추후 추가될 예정이며, 이 때 연산은 미지수가 포함되므로 추가 인터페이스가 필요합니다.
public interface NumberOperation extends Operation {

    @Override
    default BigDecimal calculate(List<String> operands) {
        List<BigDecimal> numbers = convertToNumbers(operands);
        return calculateNumbers(numbers);
    }

    BigDecimal calculateNumbers(List<BigDecimal> numbers);

    private static List<BigDecimal> convertToNumbers(List<String> operands) {
        try {
            return operands.stream()
                    .map(BigDecimal::new)
                    .toList();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
    }
}
