package hexlet.code.games;

import static hexlet.code.Utils.generateNumber;

public final class Calc {

    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";
    static final int MIN_RANGE = 1;
    static final int FIRST_RANGE = 100;
    static final int SECOND_RANGE = 100;
    static final int RANDOM_SIGN = 3;

    public static int calculateTwoNumber() {
        int result;
        int firstNumber = generateNumber(MIN_RANGE, FIRST_RANGE);
        int secondNumber = generateNumber(MIN_RANGE, SECOND_RANGE);
        int signRandomRange = generateNumber(MIN_RANGE, RANDOM_SIGN);
        char operator = OPERATORS[signRandomRange];
        switch (operator) {
            case '+' -> {
                result = firstNumber + secondNumber;
                System.out.println(DESCRIPTION + firstNumber + " + " + secondNumber);
            }
            case '-' -> {
                result = firstNumber - secondNumber;
                System.out.println(DESCRIPTION + firstNumber + " - " + secondNumber);
            }
            case '*' -> {
                result = firstNumber * secondNumber;
                System.out.println(DESCRIPTION + firstNumber + " * " + secondNumber);
            }
            default ->  throw new RuntimeException("Unknown operator: " + operator);
        }
        return result;
    }
}
