package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public final class GCD {
    static final int MIN_RANGE = 1;
    static final int RANGE = 100;
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void lookingCommonDivisor() {
        int firstRandomNumber;
        int secondRandomNumber;
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            firstRandomNumber = generateNumber(MIN_RANGE, RANGE);
            secondRandomNumber = generateNumber(MIN_RANGE, RANGE);
            String fn = String.valueOf(firstRandomNumber);
            String sn = String.valueOf(secondRandomNumber);
            String rightAnswer = fn + " " + sn;
            String question = Integer.toString(gcd(firstRandomNumber, secondRandomNumber));
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.run(DESCRIPTION, gameData);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
