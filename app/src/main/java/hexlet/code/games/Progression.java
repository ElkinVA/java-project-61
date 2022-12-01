package hexlet.code.games;

public class Progression {
    public static int arProg() {
        final int minLength = 5;
        final int maxLength = 11;
        int hiddenVar = 0;
        final int startNumberRange = 101;
        final int stepArithmeticProgressionRange = 10;
        int hiddenVarPosition;
        int randomArrayLength;
        int randomStartNumber;
        int randomStepArithmeticProgression;
        randomArrayLength = (int) (Math.random() * maxLength) + minLength;
        hiddenVarPosition = (int) (Math.random() * randomArrayLength);
        randomStepArithmeticProgression = (int) (Math.random() * stepArithmeticProgressionRange);
        randomStartNumber = (int) (Math.random() * startNumberRange);
        int[] gameArray = new int[randomArrayLength];
        System.out.print("What number is missing in the progression?\nQuestion: ");
        for (int j = 0; j < randomArrayLength; j++) {
            gameArray[j] = randomStartNumber + randomStepArithmeticProgression;
            if (j != hiddenVarPosition) {
                System.out.print(randomStartNumber + " ");
            } else {
                System.out.print(".. ");
                hiddenVar = randomStartNumber;
            }
            randomStartNumber = randomStartNumber + randomStepArithmeticProgression;
        }
        System.out.println();
        return hiddenVar;
    }
}

