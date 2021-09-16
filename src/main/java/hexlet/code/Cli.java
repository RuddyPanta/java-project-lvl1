package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greed() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, " + sc.next() + "!");
    }
}
