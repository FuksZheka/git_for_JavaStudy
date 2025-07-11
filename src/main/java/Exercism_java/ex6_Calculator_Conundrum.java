package Exercism_java;

public class ex6_Calculator_Conundrum {
    public String calculate(int operand1, int operand2, String operation) {
        validateOperation(operation);

        int result = 0;
        try {

            result = switch (operation) {
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "/" -> operand1 / operand2;
                default ->
                        throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            };

            return operand1 + " " + operation + " " + operand2 + " = " + result;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }


    }

    private void validateOperation(String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
    }
}

class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
