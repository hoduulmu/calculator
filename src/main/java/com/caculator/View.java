package com.caculator;

import java.io.BufferedReader;

public class View {

    private static final String REQUEST_INPUT = "계산식을 입력해주세요.";
    private static final String RESULT = "계산 결과: ";
    private final BufferedReader bufferedReader;

    public View(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readInput() {
        println(REQUEST_INPUT);
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public void printResult(String result) {
        println(RESULT + result);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
