package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public class Prime {
    static final int MIN = 2;
    static final int MAX = 100;
    static final int ROUNDS = 3;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void checkIfNumberPrime() {
        String rightAnswer = "";
        int j;
        String[][] answ = new String[3][2];
        for (int counter = 0; counter < ROUNDS; counter++) {
            int number = generateNumber(MIN, MAX);
            rightAnswer = isPrime(number) ? "yes" : "no";
            j = 0;
            String question = String.valueOf(number);
            answ[counter][j] = rightAnswer;
            j = 1;
            answ[counter][j] = question;
        }
        Engine.run(DESCRIPTION, answ);
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
