package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public class Prime {
    static final int MIN = 2;
    static final int MAX = 100;
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void checkIfNumberPrime() {
        String rightAnswer = "";
        int arrCounter1;
        int arrCounter2;
        String[][] answ = new String[Engine.ROUNDS][2];
        for (arrCounter1 = 0; arrCounter1 < Engine.ROUNDS; arrCounter1++) {
            int number = generateNumber(MIN, MAX);
            rightAnswer = isPrime(number) ? "yes" : "no";
            arrCounter2 = 0;
            String question = String.valueOf(number);
            answ[arrCounter1][arrCounter2] = rightAnswer;
            arrCounter2 = 1;
            answ[arrCounter1][arrCounter2] = question;
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
