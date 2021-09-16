package hexlet.code;

import java.util.List;
import java.util.Scanner;

public class Engine {

    public static final int LIFE_OF_GAME = 3;

    public static void run(String game,
                           List<String> questions,
                           List<String> computerAnswers) {


        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.next();
        System.out.println("Hello, " + playerName + "!");

        for (int i = 0; i < LIFE_OF_GAME; i++) {

            System.out.println(game);
            System.out.println("Question: " + questions.get(i));

            sc = new Scanner(System.in);
            String playerAnswer = sc.next();

            if (!(computerAnswers.get(i).equals(playerAnswer))) {

                System.out.println(playerAnswer
                        + " is wrong answer ;(. Correct answer was "
                        + computerAnswers.get(i));
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

}
