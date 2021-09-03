package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameEven {

    private static final String EVEN = "Answer 'yes' if number even otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void gameEven() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            int question = UtilsForGames.randomRandom(Engine.MAX_LIMIT);
            computerAnswers.add(isEven(question) ? "yes" : "no");
            questions.add(String.valueOf(question));
        }

        Engine.run(EVEN, questions, computerAnswers);
    }
}
