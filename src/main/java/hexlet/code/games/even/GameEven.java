package hexlet.code.games.even;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

public class GameEven {
    private static final int MAX_LIMIT = 100;
    private static final int GAME_TYPE = 1;

    public static void gameEven() {

        int question = UtilsForGames.randomRandom(MAX_LIMIT);
        String task = "Answer 'yes' if number even otherwise answer 'no'.";
        String computerAnswer = null;

        if (UtilsForGames.checkEven(question)) {
            computerAnswer = "yes";
        } else {
            computerAnswer = "no";
        }
        Engine.engine(task, String.valueOf(question), GAME_TYPE, computerAnswer);
    }
}
