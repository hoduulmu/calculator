package com.caculator.operation.impl;

import com.caculator.operation.BinaryNumberOperation;

import java.math.BigDecimal;

public class SubTract implements BinaryNumberOperation {

    @Override
    public BigDecimal calculateTwoNumbers(BigDecimal operand, BigDecimal secondOperand) {
        return operand.subtract(secondOperand)
                .stripTrailingZeros();
    }
}
