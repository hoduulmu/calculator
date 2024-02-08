package com.caculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Calculator {

    // Google, Naver Calculator Scale Is 11 And RoundingMode Is Down
    private static final int SCALE = 11;
    private static final RoundingMode DEFAULT_ROUNDING_MODE = RoundingMode.DOWN;

    public BigDecimal calculate(BigDecimal a, BigDecimal b, String operation) {
        return switch (operation) {
            case "+" -> add(a, b);
            case "-" -> subtract(a, b);
            case "*" -> multiply(a, b);
            case "/" -> divide(a, b);
            default -> throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        };
    }

    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b)
                .stripTrailingZeros();
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b)
                .stripTrailingZeros();
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b)
                .stripTrailingZeros();
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b, SCALE, DEFAULT_ROUNDING_MODE)
                .stripTrailingZeros();
    }
}
