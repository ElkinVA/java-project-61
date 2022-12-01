package hexlet.code.games;

import org.jetbrains.annotations.NotNull;

public final class Even {
    public static @NotNull String eog() {
        String result;
        final int numberRange = 100;
        int randomNumber = (int) (Math.random() * numberRange);
        if (randomNumber % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: " + randomNumber);
        return result;
    }
}

