package com.caculator.operation.impl;

import com.caculator.operation.BinaryNumberOperation;

import java.math.BigDecimal;
import java.util.List;

public class Add implements BinaryNumberOperation {

    @Override
    public BigDecimal calculateTwoNumbers(BigDecimal operand, BigDecimal secondOperand) {
        return operand.add(secondOperand)
                .stripTrailingZeros();
    }
}
