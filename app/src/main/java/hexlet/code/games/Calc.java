package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public final class Calc {

    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";
    static final int MIN_RANGE = 0;
    static final int FIRST_RANGE = 100;
    static final int SECOND_RANGE = 100;
    static final int RANDOM_SIGN = 2;
    static final int ROUNDS = 3;

    public static void calculateTwoNumber() {
        String question;
        int arrCounter1;
        int arrCounter2 = 0;
        int result;
        String[][] answ = new String[ROUNDS][2];
        for (arrCounter1 = 0; arrCounter1 < ROUNDS; arrCounter1++) {
            int firstNumber = generateNumber(MIN_RANGE, FIRST_RANGE);
            int secondNumber = generateNumber(MIN_RANGE, SECOND_RANGE);
            int signRandomRange = generateNumber(MIN_RANGE, RANDOM_SIGN);
            char operator = OPERATORS[signRandomRange];
            switch (operator) {
                case '+' -> {
                    result = firstNumber + secondNumber;
                    String rightAnswer = String.valueOf(result);
                    String fn = String.valueOf(firstNumber);
                    String sn = String.valueOf(secondNumber);
                    question = fn + " + " + sn;
                    arrCounter2 = 0;
                    answ[arrCounter1][arrCounter2] = rightAnswer;
                    arrCounter2++;
                    answ[arrCounter1][arrCounter2] = question;
                }
                case '-' -> {
                    result = firstNumber - secondNumber;
                    String rightAnswer = String.valueOf(result);
                    String fn = String.valueOf(firstNumber);
                    String sn = String.valueOf(secondNumber);
                    question = fn + " - " + sn;
                    arrCounter2 = 0;
                    answ[arrCounter1][arrCounter2] = rightAnswer;
                    arrCounter2++;
                    answ[arrCounter1][arrCounter2] = question;
                }
                case '*' -> {
                    result = firstNumber * secondNumber;
                    String rightAnswer = String.valueOf(result);
                    String fn = String.valueOf(firstNumber);
                    String sn = String.valueOf(secondNumber);
                    question = fn + " * " + sn;
                    arrCounter2 = 0;
                    answ[arrCounter1][arrCounter2] = rightAnswer;
                    arrCounter2++;
                    answ[arrCounter1][arrCounter2] = question;
                }
                default -> throw new RuntimeException("Unknown operator: " + operator);
            }
        }
        Engine.run(DESCRIPTION, answ);
    }
}
