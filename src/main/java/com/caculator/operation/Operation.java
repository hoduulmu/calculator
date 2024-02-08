package com.caculator.operation;

import java.math.BigDecimal;
import java.util.List;

public interface Operation {
    BigDecimal calculate(List<String> operands);
}
