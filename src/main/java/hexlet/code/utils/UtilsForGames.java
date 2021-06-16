package hexlet.code.utils;

import java.util.Random;

public class UtilsForGames {

    public static boolean checkIsWordYesOrNo(String word) {

        //возвращает true если игрок ввел yes или no
        //если игрок ошибся возвращает false
        if (word.equals("yes") || word.equals("no")) {
            return true;
        }

        return false;
    }

    //сравнение двух чисел
    public static void comparisonTwoInt(int answerPlayer, int answerComputer) {
        if (answerComputer == answerPlayer) {
            UtilsCommunicationWithThePlayer.correct();
        } else {
            UtilsCommunicationWithThePlayer.wrongAnswer(answerPlayer, answerComputer);
            UtilsInAndOutController.exitProgramStandard();
        }
    }

    //если число четное возвращает true
    public static boolean checkEven(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    //генерация числа с случайным максимальным значением
    public static int randomRandom(int number) {
        Random rd = new Random();
        return Integer.valueOf(rd.nextInt(number) + 1);
    }
}
