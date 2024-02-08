package com.caculator.operation;

import com.caculator.operation.impl.Add;
import com.caculator.operation.impl.Divide;
import com.caculator.operation.impl.Multiply;
import com.caculator.operation.impl.Subtract;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;

public enum OperationFactory {

    ADD("+", new Add()),
    SUBTRACT("-", new Subtract()),
    MULTIPLY("*", new Multiply()),
    DIVIDE("/", new Divide())
    ;

    private final String symbol;
    private final Operation operation;

    private static final Map<String, Operation> symbolToOperation = Arrays.stream(values())
                                                                         .collect(toMap(x -> x.symbol, x -> x.operation));


    OperationFactory(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public static Optional<Operation> getOperation(String operationSymbol) {
        return Optional.ofNullable(symbolToOperation.get(operationSymbol));
    }
}
