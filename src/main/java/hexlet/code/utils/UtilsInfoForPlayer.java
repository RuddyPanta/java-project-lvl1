package hexlet.code.utils;

import hexlet.code.games.Player;

import java.util.Scanner;

public class UtilsInfoForPlayer {

    public static void askName() {

            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner sc = new Scanner(System.in);
            Player.setPlayerName(sc.next());
            System.out.println("Hello, " + Player.getPlayerName() + "!");

    }

    public static void printQuestion(String tack, String question) {
        System.out.println(tack);
        System.out.println("Question: " + question);
    }

    public static void printAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

//    public static void wrongAnswer(String playerAnswer) {
//        String computerAnswer;
//        if (playerAnswer.equals("yes")) {
//            computerAnswer = "no";
//        } else {
//            computerAnswer = "yes";
//        }
//
//        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + computerAnswer);
//    }
//
//    public static void wrongAnswer(int playerAnswer, int computerAnswer) {
//        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + computerAnswer);
//    }

    public static void wrongAnswer(String playerAnswer, String computerAnswer) {
//        if (playerAnswer.equals("yes")) {
//            computerAnswer = "no";
//        } else {
//            computerAnswer = "yes";
//        }

        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + computerAnswer);

    }

    public static void correct() {
        System.out.println("Correct!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + Player.getPlayerName() + "!");
    }

    //завершение программы
    public static void exitProgramStandard() {
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
    public static void exitProgramWrong() {
        // System.out.println("incorrect data entry");
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
}
