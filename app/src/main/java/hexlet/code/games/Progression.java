package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Utils.generateNumber;

public class Progression {
    static final int ROUNDS = 3;
    static final int MIN = 1;
    static final int MAX_STEP = 10;
    static final int MAX = 30;
    static final String DESCRIPTION = "What number is missing in the progression?";
    public static void outputProgression() {
        final int minLength = 6;
        final int maxLength = 10;
        int hiddenVarPosition;
        int randomArrayLength;
        int randomStartNumber;
        int randomStepArithmeticProgression;
        //int i;
        int j;
        String[][] answ = new String[ROUNDS][2];
        for (int counter = 0; counter < ROUNDS; counter++) {
            randomArrayLength = generateNumber(minLength, maxLength);
            hiddenVarPosition = generateNumber(MIN, randomArrayLength - 1);
            randomStepArithmeticProgression = generateNumber(MIN, MAX_STEP);
            randomStartNumber = generateNumber(MIN, MAX);
            String[] gameArray = makeProgression(randomStartNumber, randomStepArithmeticProgression, randomArrayLength);
            String rightAnswer = gameArray[hiddenVarPosition];
            gameArray[hiddenVarPosition] = "..";
            j = 0;
            String regex = "[\\[\\]|,]";
            String question = Arrays.toString(gameArray);
            question = question.replaceAll(regex, "");
            answ[counter][j] = rightAnswer;
            j = 1;
            answ[counter][j] = question;
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

