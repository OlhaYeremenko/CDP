package CreationalPatterns;

/**
 *Factory method
 */
public class CalculateConfiguration {

    public static Operation createOperation(String operation) {
        switch (operation) {
            case "+":
                return Operation.Plus;
            case "-":
                return Operation.Minus;
            case "*":
                return Operation.Multiply;
            case "/":
                return Operation.Divide;
            default:
                return null;
        }
    }
}
