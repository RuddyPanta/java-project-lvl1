package hexlet.code.games.even;

import hexlet.code.games.Engine;
import hexlet.code.games.Game;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void gameEven() {

        int question;

        List<String> questions = new ArrayList<>(Engine.getLifeOfGame());
        List<String> computerAnswers = new ArrayList<>(Engine.getLifeOfGame());

        for (int i = 0; i < Engine.getLifeOfGame(); i++) {
            question = UtilsForGames.randomRandom(Engine.getMaxLimit());
            computerAnswers.add(isEven(question) ? "yes" : "no");
            questions.add(String.valueOf(question));
        }

        Engine.run(Game.EVEN, questions, computerAnswers);
    }
}
