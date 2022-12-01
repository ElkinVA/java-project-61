package hexlet.code;

import java.util.Scanner;
import static hexlet.code.games.Calc.cg;
import static hexlet.code.games.Even.eog;
import static hexlet.code.games.GCD.nodCh;
import static hexlet.code.games.Prime.primeNum;
import static hexlet.code.games.Progression.arProg;

public class Engine {

    private static String userName;

    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner namescan = new Scanner(System.in, "UTF-8");
        System.out.print("May I have your name? ");
        userName = namescan.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void getGame(String userChoice) {
        greeting();
        final int numberOfTests = 3;
        for (int i = 0; i < numberOfTests; i++) {
            switch (userChoice) {
                case "2" -> answer(eog());
                case "3" -> answer(cg());
                case "4" -> answer(nodCh());
                case "5" -> answer(arProg());
                case "6" -> answer(primeNum());
                default ->  System.out.println("People's! Choice!");
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
                System.exit(0);
            }
        }
    }

    public static void answer(String userAnswer) {
        String yesWrongMessage = "'yes' is wrong answer ;(. Correct answer was 'no'\nLet's try again, ";
        String noWrongMessage = "'no' is wrong answer ;(. Correct answer was 'yes'\nLet's try again, ";
        System.out.print("Your answer: ");
        Scanner choicescan = new Scanner(System.in, "UTF-8");
        String answer = choicescan.nextLine();
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            if (answer.equals("yes")) {
                System.out.println(yesWrongMessage + userName + "!");
            } else {
                System.out.println(noWrongMessage + userName + "!");
            }
            System.exit(0);
        }
    }

    public static void answer(int userAnswer) {
        System.out.print("Your answer: ");
        Scanner choicescan = new Scanner(System.in, "UTF-8");
        int answer = choicescan.nextInt();
        if (answer == userAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + userAnswer + "'.\nLet's try again, " + userName + "!\n");
            System.exit(0);
        }
    }
}
