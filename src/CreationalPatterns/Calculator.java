package CreationalPatterns;

import java.util.List;

public class Calculator {
    private static Calculator calculator;

    private Calculator() {
    }

    public static synchronized Calculator getCalculator() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public  String performCalculation(List<Double> numberList, Operation o) {
        String expression = "";
        for (Double number : numberList) {
            expression += " " + number.toString() + " " + o.toString();
        }
        return expression;
    }
}