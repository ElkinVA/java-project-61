package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Prime {
    static final int MIN = 2;
    static final int MAX = 100;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void checkIfNumberPrime() {
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = generateNumber(MIN, MAX);
            String rightAnswer = isPrime(number) ? "yes" : "no";
            String question = String.valueOf(number);
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.run(DESCRIPTION, gameData);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider += 1;
        }
        return true;
    }
}
