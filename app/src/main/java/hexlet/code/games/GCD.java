package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public class GCD {
    static final int MIN_RANGE = 1;
    static final int FIRST_RANGE = 100;
    static final int SECOND_RANGE = 100;
    static final int ROUNDS = 3;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void lookingCommonDivisor() {
        int firstRandomNumber;
        int secondRandomNumber;
        int j;
        String[][] answ = new String[3][2];
        for (int counter = 0; counter < ROUNDS; counter++) {
            firstRandomNumber = generateNumber(MIN_RANGE, FIRST_RANGE);
            secondRandomNumber = generateNumber(MIN_RANGE, SECOND_RANGE);
            String fn = String.valueOf(firstRandomNumber);
            String sn = String.valueOf(secondRandomNumber);
            String rightAnswer = fn + " " + sn;
            int gcdCount = gcd(firstRandomNumber, secondRandomNumber);
            String question = String.valueOf(gcdCount);
            j = 0;
            answ[counter][j] = question;
            j++;
            answ[counter][j] = rightAnswer;
        }
        Engine.run(DESCRIPTION, answ);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
