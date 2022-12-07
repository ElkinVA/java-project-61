package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public class GCD {
    static final int MIN_RANGE = 1;
    static final int FIRST_RANGE = 100;
    static final int SECOND_RANGE = 100;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void lookingCommonDivisor() {
        int firstRandomNumber;
        int secondRandomNumber;
        int arrCounter1;
        int arrCounter2 = 0;
        String[][] answ = new String[Engine.ROUNDS][2];
        for (arrCounter1 = 0; arrCounter1 < Engine.ROUNDS; arrCounter1++) {
            firstRandomNumber = generateNumber(MIN_RANGE, FIRST_RANGE);
            secondRandomNumber = generateNumber(MIN_RANGE, SECOND_RANGE);
            String fn = String.valueOf(firstRandomNumber);
            String sn = String.valueOf(secondRandomNumber);
            String rightAnswer = fn + " " + sn;
            int gcdCount = gcd(firstRandomNumber, secondRandomNumber);
            String question = String.valueOf(gcdCount);
            arrCounter2 = 0;
            answ[arrCounter1][arrCounter2] = question;
            arrCounter2++;
            answ[arrCounter1][arrCounter2] = rightAnswer;
        }
        Engine.run(DESCRIPTION, answ);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
