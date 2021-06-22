package hexlet.code.games.calc;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

public class GameCalc {
    private static final int MAX_LIMIT = 100;
    private static final int MAX_RAND_FOR_SIGN = 9;
    private static final int MAX_LIMIT_PLUS = 3;
    private static final int MAX_LIMIT_MINUS = 6;
    private static final int MAX_LIMIT_MULTIPLICATION = 9;
    private static final int GAME_TYPE = 2;
    public static void gameCalc() {
        //формируем случайные числа и операнд
        int varA = UtilsForGames.randomRandom(MAX_LIMIT);
        int varB = UtilsForGames.randomRandom(MAX_LIMIT);
        int varSign = UtilsForGames.randomRandom(MAX_RAND_FOR_SIGN);

        String question;
        String computerAnswer;

        //используется кубик с 9ю гранями для
        //повышения вариативности
        //сложение
        if (varSign <= MAX_LIMIT_PLUS) {

            String task = "What is the result of the expression?";
            question = varA + " + " + varB;
            computerAnswer = String.valueOf(varA + varB);
            Engine.engine(task, question, GAME_TYPE, computerAnswer);
//
        }

        //вычитание
        if (varSign > MAX_LIMIT_PLUS && varSign <= MAX_LIMIT_MINUS) {

            String task = "What is the result of the expression?";
            question = varA + " - " + varB;
            computerAnswer = String.valueOf(varA - varB);
            Engine.engine(task, question, GAME_TYPE, computerAnswer);
//
        }

        //умножение
        if (varSign > MAX_LIMIT_MINUS && varSign <= MAX_LIMIT_MULTIPLICATION) {

            String task = "What is the result of the expression?";
            question = varA + " * " + varB;
            computerAnswer = String.valueOf(varA * varB);
            Engine.engine(task, question, GAME_TYPE, computerAnswer);
//
        }


    }
}
