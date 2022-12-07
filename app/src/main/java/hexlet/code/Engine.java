package hexlet.code;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    private static final String DESC_CENTER = "' is wrong answer ;(. Correct answer was '";
    private static final String DESC_RGH = "'.\nLet's try again,Let's try again, ";

    public static void run(String description, String[][] roundsData) {
        int arrCounter1;
        int arrCounter2;
        System.out.println("\nWelcome to the Brain Games!");
        Scanner nameScan = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("May I have your name? ");
        String usName = nameScan.nextLine();
        System.out.println("Hello, " + usName + "!");
        for (arrCounter1 = 0; arrCounter1 < ROUNDS; arrCounter1++) {
            arrCounter2 = 1;
            System.out.println(description + "\nQuestion: " + roundsData[arrCounter1][arrCounter2]);
            System.out.print("Your answer: ");
            Scanner choicescan = new Scanner(System.in, StandardCharsets.UTF_8);
            String usAnsw = choicescan.nextLine();
            arrCounter2 = 0;
            String answ = roundsData[arrCounter1][arrCounter2];
            if (answ.equals(usAnsw)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usAnsw + DESC_CENTER + answ + DESC_RGH + usName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + usName + "!");
        System.exit(0);
    }
}

