package hexlet.code;

import java.util.Scanner;
import static hexlet.code.games.Calc.cg;
import static hexlet.code.games.Even.eog;
import static hexlet.code.games.GCD.nodCh;
import static hexlet.code.games.Prime.primeNum;
import static hexlet.code.games.Progression.arProg;

public class Engine {

    private static String name;

    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner namescan = new Scanner(System.in, "UTF-8");
        System.out.print("May I have your name? ");
        name = namescan.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void getGame(String x) {
        greeting();
        final int numberOfTests = 3;
        for (int i = 0; i < numberOfTests; i++) {
            switch (x) {
                case "2" -> answer(eog());
                case "3" -> answer(cg());
                case "4" -> answer(nodCh());
                case "5" -> answer(arProg());
                case "6" -> answer(primeNum());
                default ->  System.out.println("People's! Choice!");
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
                System.exit(0);
            }
        }
    }

    public static void answer(String y) {
        String yesWrongMessage = "'yes' is wrong answer ;(. Correct answer was 'no'\nLet's try again, ";
        String noWrongMessage = "'no' is wrong answer ;(. Correct answer was 'yes'\nLet's try again, ";
        System.out.print("Your answer: ");
        Scanner choicescan = new Scanner(System.in, "UTF-8");
        String answer = choicescan.nextLine();
        if (answer.equals(y)) {
            System.out.println("Correct!");
        } else {
            if (answer.equals("yes")) {
                System.out.println(yesWrongMessage + name + "!");
            } else {
                System.out.println(noWrongMessage + name + "!");
            }
            System.exit(0);
        }
    }

    public static void answer(int x) {
        System.out.print("Your answer: ");
        Scanner choicescan = new Scanner(System.in, "UTF-8");
        int answer = choicescan.nextInt();
        if (answer == x) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + x + "'.\nLet's try again, " + name + "!\n");
            System.exit(0);
        }
    }
}
