package hexlet.code;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner namescan = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("May I have your name? ");
        String userName = namescan.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
