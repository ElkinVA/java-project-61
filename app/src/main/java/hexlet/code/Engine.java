package hexlet.code;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;
    static String descCenter = "' is wrong answer ;(. Correct answer was '";
    static String descRgh = "'.\nLet's try again,Let's try again, ";

    public static void run(String description, String[][] roundsData) {
        int j;
        System.out.println("\nWelcome to the Brain Games!");
        Scanner namescan = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("May I have your name? ");
        String usName = namescan.nextLine();
        System.out.println("Hello, " + usName + "!");
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            j = 1;
            System.out.println(description + "\nQuestion: " + roundsData[i][j]);
            System.out.print("Your answer: ");
            Scanner choicescan = new Scanner(System.in, StandardCharsets.UTF_8);
            String usAnsw = choicescan.nextLine();
            j = 0;
            String answ = roundsData[i][j];
            if (answ.equals(usAnsw)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usAnsw + descCenter + answ + descRgh + usName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + usName + "!");
        System.exit(0);
    }
}

