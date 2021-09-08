package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameGCD {

    private static int searchGCD(int varA, int varB) {
        while (varA != 0 && varB != 0) {
            if (varA > varB) {
                varA = varA % varB;
            } else {
                varB = varB % varA;
            }
        }
        return varA + varB;
    }

    public static void gameGCD() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        String questionConsole = "Find the greatest common divisor of given numbers.";

        int varA;
        int varB;


        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            varA = UtilsForGames.randomRandom(Engine.MAX_LIMIT);
            varB = UtilsForGames.randomRandom(Engine.MAX_LIMIT);

            questions.add(String.valueOf(varA + " " + varB));
            computerAnswers.add(String.valueOf(searchGCD(varA, varB)));
        }

        Engine.run(questionConsole, questions, computerAnswers);
    }
}
