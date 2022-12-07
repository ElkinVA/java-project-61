package hexlet.code;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String description, String[][] roundsData) {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner nameScan = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("May I have your name? ");
        String usName = nameScan.nextLine();
        System.out.println("Hello, " + usName + "!");
        for (var answ : roundsData) {
            System.out.println(description + "\nQuestion: " + answ[0]);
            System.out.print("Your answer: ");
            Scanner choicescan = new Scanner(System.in, StandardCharsets.UTF_8);
            String usAnsw = choicescan.nextLine();
            if (answ[1].equals(usAnsw)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usAnsw + "' is wrong answer ;(. Correct answer was '" + answ[1]
                        + "'.\nLet's try again,Let's try again, " + usName + "!"
                );
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + usName + "!");
        System.exit(0);
    }
}

