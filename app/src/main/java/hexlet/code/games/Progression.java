package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Progression {
    static final int MIN_LENGTH = 6;
    static final int MAX_LENGTH = 10;
    static final int MIN = 1;
    static final int MAX_STEP = 10;
    static final int PROGRESSION_LENGTH = 10;
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void outputProgression() {
        int hiddenIndex;
        int step;
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            hiddenIndex = generateNumber(MIN, PROGRESSION_LENGTH - 1);
            step = generateNumber(MIN, MAX_STEP);
            int first = generateNumber(MIN_LENGTH, MAX_LENGTH);
            String[] progression = makeProgression(first, step);
            String rightAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.run(DESCRIPTION, gameData);
    }
    private static String[] makeProgression(int first, int step) {
        String[] progression = new String[Progression.PROGRESSION_LENGTH];
        for (int i = 0; i < Progression.PROGRESSION_LENGTH; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}

