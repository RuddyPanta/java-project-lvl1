package hexlet.code.games.calc;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameCalc {
    private static final int MAX_LIMIT = 100;
    private static final int MAX_RAND_FOR_SIGN = 9;
    private static final int MAX_LIMIT_PLUS = 3;
    private static final int MAX_LIMIT_MINUS = 6;
    private static final int MAX_LIMIT_MULTIPLICATION = 9;
    private static final int LIFE_OF_GAME = 3;

    private static String question;
    private static String computerAnswer;
    private static String tack;

    public static void gameCalc() {

        List<String> tackList = new ArrayList<>(LIFE_OF_GAME);
        List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
        List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);

        for (int i = 0; i < LIFE_OF_GAME; i++) {

            //формируем случайные числа и операнд
            int varA = UtilsForGames.randomRandom(MAX_LIMIT);
            int varB = UtilsForGames.randomRandom(MAX_LIMIT);
            int varSign = UtilsForGames.randomRandom(MAX_RAND_FOR_SIGN);

            //используется кубик с 9ю гранями для
            //повышения вариативности
            //сложение
            if (varSign <= MAX_LIMIT_PLUS) {

                tack = "What is the result of the expression?";
                question = varA + " + " + varB;
                computerAnswer = String.valueOf(varA + varB);

//
            }

            //вычитание
            if (varSign > MAX_LIMIT_PLUS && varSign <= MAX_LIMIT_MINUS) {

                tack = "What is the result of the expression?";
                question = varA + " - " + varB;
                computerAnswer = String.valueOf(varA - varB);

//
            }

            //умножение
            if (varSign > MAX_LIMIT_MINUS && varSign <= MAX_LIMIT_MULTIPLICATION) {

                tack = "What is the result of the expression?";
                question = varA + " * " + varB;
                computerAnswer = String.valueOf(varA * varB);


            }

            tackList.add(tack);
            questionList.add(question);
            computerAnswerList.add(computerAnswer);

        }
            Engine.engine(tackList, questionList, computerAnswerList, LIFE_OF_GAME);
    }

}
