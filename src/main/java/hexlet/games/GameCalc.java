package hexlet.games;

import hexlet.code.UtilsForGames;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class GameCalc {

    private static final int MAX_RAND_FOR_SIGN = 9;
    private static final int MAX_LIMIT_PLUS = 3;
    private static final int MAX_LIMIT_MINUS = 6;
    private static final int MAX_LIMIT_MULTIPLICATION = 9;
    private static final String CALC = "What is the result of the expression?";

    public static void gameCalc() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {

            //формируем случайные числа и операнд
            int varA = UtilsForGames.randomRandom(Engine.MAX_LIMIT);
            int varB = UtilsForGames.randomRandom(Engine.MAX_LIMIT);
            int varSign = UtilsForGames.randomRandom(MAX_RAND_FOR_SIGN);

            //используется кубик с 9ю гранями для
            //повышения вариативности
            //сложение
            if (varSign <= MAX_LIMIT_PLUS) {
                questions.add(varA + " + " + varB);
                computerAnswers.add(String.valueOf(varA + varB));
            }

            //вычитание
            if (varSign > MAX_LIMIT_PLUS && varSign <= MAX_LIMIT_MINUS) {
                questions.add(varA + " - " + varB);
                computerAnswers.add(String.valueOf(varA - varB));
            }

            //умножение
            if (varSign > MAX_LIMIT_MINUS && varSign <= MAX_LIMIT_MULTIPLICATION) {
                questions.add(varA + " * " + varB);
                computerAnswers.add(String.valueOf(varA * varB));
            }
        }

        Engine.run(CALC, questions, computerAnswers);
    }

}
