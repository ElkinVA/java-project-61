package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Utils.generateNumber;

public class Progression {
    static final int MIN_LENGTH = 6;
    static final int MAX_LENGTH = 10;
    static final int ROUNDS = 3;
    static final int MIN = 1;
    static final int MAX_STEP = 10;
    static final int MAX = 30;
    static final String DESCRIPTION = "What number is missing in the progression?";
    public static void outputProgression() {
        int hiddenVarPosition;
        int randomArrayLength;
        int randomStartNumber;
        int randomStepArithmeticProgression;
        int arrCounter1;
        int arrCounter2;
        String[][] answ = new String[ROUNDS][2];
        for (arrCounter1 = 0; arrCounter1 < ROUNDS; arrCounter1++) {
            randomArrayLength = generateNumber(MIN_LENGTH, MAX_LENGTH);
            hiddenVarPosition = generateNumber(MIN, randomArrayLength - 1);
            randomStepArithmeticProgression = generateNumber(MIN, MAX_STEP);
            randomStartNumber = generateNumber(MIN, MAX);
            String[] gameArray = makeProgression(randomStartNumber, randomStepArithmeticProgression, randomArrayLength);
            String rightAnswer = gameArray[hiddenVarPosition];
            gameArray[hiddenVarPosition] = "..";
            arrCounter2 = 0;
            //String regex = "[\\[\\]|,]";
            String question = Arrays.toString(gameArray);
            question = question.replaceAll("[\\[\\]|,]", "");
            answ[arrCounter1][arrCounter2] = rightAnswer;
            arrCounter2 = 1;
            answ[arrCounter1][arrCounter2] = question;
        }
        Engine.run(DESCRIPTION, answ);
    }
    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}

