package hexlet.code.games.even;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameEven {
    private static final int MAX_LIMIT = 100;
    private static final int LIFE_OF_GAME = 3;

    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    public static void gameEven() {

        String task;
        String computerAnswer;

        int question;

        List<String> taskList = new ArrayList<>(LIFE_OF_GAME);
        List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
        List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);


        task = "Answer 'yes' if number even otherwise answer 'no'.";

        for (int i = 0; i < LIFE_OF_GAME; i++) {
            question = UtilsForGames.randomRandom(MAX_LIMIT);
            if (checkEven(question)) {
                computerAnswer = "yes";
            } else {
                computerAnswer = "no";
            }

            taskList.add(task);
            questionList.add(String.valueOf(question));
            computerAnswerList.add(computerAnswer);
        }

        Engine.engine(taskList, questionList, computerAnswerList, LIFE_OF_GAME);
    }
}
