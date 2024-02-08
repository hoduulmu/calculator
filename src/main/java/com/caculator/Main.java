package com.caculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        View view = new View(new BufferedReader(new InputStreamReader(System.in)));
        Calculator calculator = new Calculator();
        Application application = new Application(view, calculator);
        application.run();
    }
}
