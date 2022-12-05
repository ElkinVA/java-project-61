package hexlet.code.games;

import org.jetbrains.annotations.NotNull;

public final class Even {

    public static Boolean isEven(int i) {
        return (i % 2) == 0;
    }
    public static @NotNull String parityCheck() {
        final int numberRange = 100;
        int randomNumber = (int) (Math.random() * numberRange);
        String result = isEven(randomNumber) ? "yes" : "no";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: " + randomNumber);
        return result;
    }
}

