package com.caculator;

import com.caculator.operation.impl.Add;
import com.caculator.operation.impl.Divide;
import com.caculator.operation.impl.Multiply;
import com.caculator.operation.impl.SubTract;

import java.math.BigDecimal;

public class Calculator {

    public BigDecimal calculate(BigDecimal a, BigDecimal b, String operation) {
        return switch (operation) {
            case "+" -> new Add().calculateTwoNumbers(a, b);
            case "-" -> new SubTract().calculateTwoNumbers(a, b);
            case "*" -> new Multiply().calculateTwoNumbers(a, b);
            case "/" -> new Divide().calculateTwoNumbers(a, b);
            default -> throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        };
    }
}
