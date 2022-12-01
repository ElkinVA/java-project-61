package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.getGame;
import static hexlet.code.Engine.greeting;

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
            case "1" -> greeting();
            case "2" -> getGame("2");
            case "3" -> getGame("3");
            case "4" -> getGame("4");
            case "5" -> getGame("5");
            case "6" -> getGame("6");
            case "0" -> System.exit(0);
            default -> System.out.println("People's! Choice!");
        }
    }
}
