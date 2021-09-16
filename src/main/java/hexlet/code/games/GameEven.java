package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class GameEven {

    private static final String QUESTION_CONSOLE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void gameEven() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            int question = Utils.randomRandom(Utils.MAX_LIMIT);
            computerAnswers.add(isEven(question) ? "yes" : "no");
            questions.add(String.valueOf(question));
        }

        Engine.run(QUESTION_CONSOLE, questions, computerAnswers);
    }
}
