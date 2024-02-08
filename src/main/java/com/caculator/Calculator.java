package com.caculator;

import com.caculator.operation.OperationFactory;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {

    private static final String SPACE = " ";
    private static final int PROPER_INPUT_LENGTH = 3;

    public BigDecimal calculate(String input) {
        String[] operands = input.split(SPACE);
        validateInput(operands);
        return calculate(List.of(operands[0], operands[2]), operands[1]);
    }

    private BigDecimal calculate(List<String> operands, String operation) {
        return OperationFactory.getOperation(operation)
                .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산자입니다."))
                .calculate(operands);
    }

    private void validateInput(String[] operands) {
        if (operands.length != PROPER_INPUT_LENGTH) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
