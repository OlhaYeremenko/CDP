package CreationalPatterns.Singleton_FactoryMethod;

import java.util.Arrays;

import static CreationalPatterns.Singleton_FactoryMethod.Calculator.getCalculator;

public class Calculations {

    public static void main(String[] args) {

        Calculator calculator= getCalculator();
        Operation operation= CalculateConfiguration.createOperation("+");

        String expression= calculator.performCalculation(Arrays.asList(1.38, 2.6, 4.3), operation);
        System.out.println(expression);
    }

}
