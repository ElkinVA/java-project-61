package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public final class Even {
    static final int MIN = 1;
    static final int MAX = 100;
    static final String DESC = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean isEven(int i) {
        return (i % 2) == 0;
    }
    public static void parityCheck() {
        int arrCounter1;
        int arrCounter2 = 0;
        String[][] answ = new String[Engine.ROUNDS][2];
        for (arrCounter1 = 0; arrCounter1 < Engine.ROUNDS; arrCounter1++) {
            int randomNumber = generateNumber(MIN, MAX);
            String rightAnswer = isEven(randomNumber) ? "yes" : "no";
            String question = String.valueOf(randomNumber);
            answ[arrCounter1][arrCounter2] = rightAnswer;
            arrCounter2++;
            answ[arrCounter1][arrCounter2] = question;
            arrCounter2 = 0;
        }
        Engine.run(DESC, answ);
    }
}
