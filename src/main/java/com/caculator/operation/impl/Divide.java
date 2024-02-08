package com.caculator.operation.impl;

import com.caculator.operation.BinaryNumberOperation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements BinaryNumberOperation {

    // Google, Naver Calculator Scale Is 11 And RoundingMode Is Down
    private static final int SCALE = 11;

    @Override
    public BigDecimal calculateTwoNumbers(BigDecimal operand, BigDecimal secondOperand) {
        return operand.divide(secondOperand, SCALE, RoundingMode.DOWN)
                .stripTrailingZeros();
    }
}
