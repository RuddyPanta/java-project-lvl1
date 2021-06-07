package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void askName() {
       // System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String nameUser = sc.next();
        System.out.println("Hello, " + nameUser);
        sc.close();
    }
}
