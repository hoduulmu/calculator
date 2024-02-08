package com.caculator;

import java.math.BigDecimal;

public class Application {

    private final View view;
    private final Calculator calculator;

    public Application(View view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void run() {
        String expression = view.readInput();
        BigDecimal result = calculator.calculate(expression);
        view.printResult(result.toString());
    }
}
