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
        int i;
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = generateNumber(MIN, MAX);
            String rightAnswer = isEven(randomNumber) ? "yes" : "no";
            String question = String.valueOf(randomNumber);
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.run(DESC, gameData);
    }
}
