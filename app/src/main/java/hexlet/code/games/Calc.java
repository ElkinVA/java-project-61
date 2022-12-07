package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Calc {
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";
    static final int MIN_RANGE = 0;
    static final int RANGE = 100;

    public static void calculateTwoNumber() {
        String question;
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = generateNumber(MIN_RANGE, RANGE);
            int secondNumber = generateNumber(MIN_RANGE, RANGE);
            int signRandomRange = generateNumber(MIN_RANGE, OPERATORS.length - 1);
            char operator = OPERATORS[signRandomRange];
            String rightAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));
            String fn = String.valueOf(firstNumber);
            String sn = String.valueOf(secondNumber);
            String op = String.valueOf(operator);
            question = fn + " " + op + " " + sn;
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.run(DESCRIPTION, gameData);
    }

    private static int calculate(char operator, int number1, int number2) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
