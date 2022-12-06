package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.games.Calc.calculateTwoNumber;
import static hexlet.code.games.Even.parityCheck;
import static hexlet.code.games.GCD.lookingCommonDivisor;
import static hexlet.code.games.Prime.checkIfNumberPrime;
import static hexlet.code.games.Progression.outputProgression;

public class App {
    public static void main(String[] args) {
        String choice;
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        Scanner choiceInput = new Scanner(System.in, "UTF-8");
        choice = choiceInput.nextLine();
        switch (choice) {
            case "1" -> greet();
            case "2" -> parityCheck();
            case "3" -> calculateTwoNumber();
            case "4" -> lookingCommonDivisor();
            case "5" -> outputProgression();
            case "6" -> checkIfNumberPrime();
            case "0" -> System.exit(0);
            default -> throw new RuntimeException("Unknown operator: " + choice);
        }
    }
}
