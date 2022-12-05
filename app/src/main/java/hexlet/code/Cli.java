package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        String userName = "";
        System.out.println("\nWelcome to the Brain Games!");
        Scanner namescan = new Scanner(System.in, "UTF-8");
        System.out.print("May I have your name? ");
        userName = namescan.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
