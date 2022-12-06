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
            System.out.println("randomArrayLength:" + randomArrayLength);
            hiddenVarPosition = generateNumber(MIN, randomArrayLength - 1);
            System.out.println("hiddenVarPosition:" + hiddenVarPosition);
            randomStepArithmeticProgression = generateNumber(MIN, MAX_STEP);
            System.out.println("randomStepArithmeticProgression:" + randomStepArithmeticProgression);
            randomStartNumber = generateNumber(MIN, MAX);
            System.out.println("randomStartNumber:" + randomStartNumber);
            String[] gameArray = makeProgression(randomStartNumber, randomStepArithmeticProgression, randomArrayLength);
            System.out.println("gameArray.lenght:" + gameArray.length);
            /*for (i = 0; i < randomArrayLength; i++) {
                System.out.println("gameArray[i]:" + gameArray[i]);
                gameArray[i] = String.valueOf(randomStartNumber + randomStepArithmeticProgression);
                randomStartNumber = randomStartNumber + randomStepArithmeticProgression;
            }*/
            String rightAnswer = gameArray[hiddenVarPosition];
            System.out.println("gameArrayHP:" + gameArray[hiddenVarPosition]);
            gameArray[hiddenVarPosition] = "..";
            System.out.println("gameArrayHP:" + gameArray[hiddenVarPosition]);
            j = 0;
            String regex = "[\\[\\]|,]";
            String question = Arrays.toString(gameArray);
            System.out.println("question " + question);
            question = question.replaceAll(regex, "");
            System.out.println("question " + question);
            answ[counter][j] = rightAnswer;
            System.out.print(" answ" + answ[counter][j]);
            j = 1;
            answ[counter][j] = question;
            System.out.println(answ[counter][j]);
            System.out.println(answ[counter][j]);
        }
        Engine.run(DESCRIPTION, answ);
    }
    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
            System.out.print("PROGR: " + progression[i] + " ");
        }
        return progression;
    }
}

