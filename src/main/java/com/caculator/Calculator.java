package com.caculator;

import com.caculator.operation.OperationFactory;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {

    public BigDecimal calculate(String operand, String secondOperand, String operation) {
        return OperationFactory.getOperation(operation)
                .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산자입니다."))
                .calculate(List.of(operand, secondOperand));
    }
}
