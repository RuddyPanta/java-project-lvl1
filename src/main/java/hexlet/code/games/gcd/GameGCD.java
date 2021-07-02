package hexlet.code.games.gcd;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameGCD {

    private static final int MAX_LIMIT = 1000;
    private static final int LIFE_OF_GAME = 3;

    public static void gameGCD() {

        String task;
        String question;
        String computerAnswer;

        int varA;
        int varB;

        List<String> taskList = new ArrayList<>(LIFE_OF_GAME);
        List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
        List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);

        for (int i = 0; i < LIFE_OF_GAME; i++) {
            varA = UtilsForGames.randomRandom(MAX_LIMIT);
            varB = UtilsForGames.randomRandom(MAX_LIMIT);
            task = "Find the greatest common divisor of given numbers.";
            question = varA + " " + varB;
            computerAnswer = String.valueOf(SearchGCD.searchGCD(varA, varB));

            taskList.add(task);
            questionList.add(String.valueOf(question));
            computerAnswerList.add(computerAnswer);

        }

        Engine.engine(taskList, questionList, computerAnswerList, LIFE_OF_GAME);
    }
}
