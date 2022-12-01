package hexlet.code.games;

public class GCD {

    public static int lookingCommonDivisor() {
        int firstRandomNumber;
        int secondRandomNumber;
        final int firstNumberRange = 101;
        final int secondNumberRange = 101;
        String resultMessage = "Find the greatest common divisor of given numbers.\nQuestion: ";
        int j;
        int i = 0;
        firstRandomNumber = (int) (Math.random() * firstNumberRange);
        secondRandomNumber = (int) (Math.random() * secondNumberRange);
        System.out.println(resultMessage + firstRandomNumber + " " + secondRandomNumber);
        if (firstRandomNumber >= secondRandomNumber) {
            j = firstRandomNumber;
        } else {
            j = secondRandomNumber;
        }
        while (j > 0) {
            if ((firstRandomNumber % j) == 0) {
                if ((secondRandomNumber % j) == 0) {
                    i = j;
                    break;
                }
            }
            j--;
        }
        return i;
    }
}
