package com.caculator.operation.impl;

import com.caculator.operation.BinaryNumberOperation;

import java.math.BigDecimal;

public class Multiply implements BinaryNumberOperation {

    @Override
    public BigDecimal calculateTwoNumbers(BigDecimal operand, BigDecimal secondOperand) {
        return operand.multiply(secondOperand)
                .stripTrailingZeros();
    }
}
