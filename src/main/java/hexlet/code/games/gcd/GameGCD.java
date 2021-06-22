package hexlet.code.games.gcd;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

public class GameGCD {
    private static final int MAX_LIMIT = 1000;
    private static final int GAME_TYPE = 2;
    public static void gameGCD() {

        int varA = UtilsForGames.randomRandom(MAX_LIMIT);
        int varB = UtilsForGames.randomRandom(MAX_LIMIT);
        String tack = "Find the greatest common divisor of given numbers.";
        String question = varA + " " + varB;
        String answerComputer = String.valueOf(SearchGCD.searchGCD(varA, varB));
        Engine.engine(tack, question, GAME_TYPE, answerComputer);

    }
}
