package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class GameCalc {

    private static final String QUESTION_CONSOLE = "What is the result of the expression?";

    public static void gameCalc() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {

            //формируем случайные числа и операнд
            //используется кубик с 9ю гранями для
            //повышения вариативности
            final int rangeForSign = 9;
            int varA = Utils.randomRandom(Utils.MAX_LIMIT);
            int varB = Utils.randomRandom(Utils.MAX_LIMIT);
            int varSign = Utils.randomRandom(rangeForSign);

            final int rangeForPlus = 3;
            final int rangeForMinus = 6;
            final int rangeForMultiplication = 9;
            //сложение
            if (varSign <= rangeForPlus) {
                questions.add(varA + " + " + varB);
                computerAnswers.add(String.valueOf(varA + varB));
            }

            //вычитание
            if (varSign > rangeForPlus && varSign <= rangeForMinus) {
                questions.add(varA + " - " + varB);
                computerAnswers.add(String.valueOf(varA - varB));
            }

            //умножение
            if (varSign > rangeForMinus && varSign <= rangeForMultiplication) {
                questions.add(varA + " * " + varB);
                computerAnswers.add(String.valueOf(varA * varB));
            }
        }

        Engine.run(QUESTION_CONSOLE, questions, computerAnswers);
    }

}
