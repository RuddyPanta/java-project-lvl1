package hexlet.code.utils;

import hexlet.code.games.Player;

public class UtilsCommunicationWithThePlayer {

    public static void askName() {
        if (Player.getPlayerName().equals("NoName")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Player.setPlayerName(UtilsInAndOutController.scannerInStr());
            System.out.println("Hello, " + Player.getPlayerName() + "!");
        }
    }

    //________________________________________________//
    public static void gameInterfaceQuestion(String firstCollum, String question) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question);
    }

    public static void gameInterfaceQuestion(String firstCollum, int question) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question);
    }

    public static void gameInterfaceQuestion(String firstCollum, int question1, String sign, int question2) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question1 + sign + question2);
    }

    //________________________________________________//

    public static void gameInterfaceAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

    public static void gameInterfaceAnswer(int answer) {
        System.out.println("Your answer: " + answer);
    }

    public static void wrongAnswer(String playerAnswer) {
        String computerAnswer;
        if (playerAnswer.equals("yes")) {
            computerAnswer = "no";
        } else {
            computerAnswer = "yes";
        }

        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + computerAnswer);
    }

    public static void wrongAnswer(int playerAnswer, int computerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + computerAnswer);
    }

    //________________________________________________//

    public static void correct() {
        System.out.println("Correct!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + Player.getPlayerName() + "!");
    }
}
