package hexlet.code.view;

import hexlet.code.controllers.Player;

public class GamesInterface {
    //метод где ответ String
    public static void gameInterfaceQuestion(String firstCollum, String question) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question);
    }
    //метод где ответ int
    public static void gameInterfaceQuestion(String firstCollum, int question) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question);
    }
    //метод где две переменные int и операнд
    public static void gameInterfaceQuestion(String firstCollum, int question1, String sign, int question2) {
        System.out.println(firstCollum);
        System.out.println("Question: " + question1 + sign + question2);
    }
    //метод где вопрос и ответ String
    public static void gameInterfaceAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }
    //метод где вопрос и ответ int
    public static void gameInterfaceAnswer(int answer) {
        System.out.println("Your answer: " + answer);
    }

    public static void correct() {
        System.out.println("Correct!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + Player.getPlayerName() + "!");
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
}
