package hexlet.code.games.prime;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GamePrime {

    private static final int MAX_LIMIT = 500;
    private static final int LIFE_OF_GAME = 3;

    public static void gamePrime() {

        String task;
        String question;
        String computerAnswer;

        int number;

        List<String> taskList = new ArrayList<>(LIFE_OF_GAME);
        List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
        List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);

        for (int i = 0; i < LIFE_OF_GAME; i++) {
            //генерируем число
            number = UtilsForGames.randomRandom(MAX_LIMIT);

            //если число разделиться без остатка, то оно составное
            //Наименьший положительный и отличный от 1 делитель основного числа а
            // не превосходит √a, где √a является арифметическим корнем заданного числа
            //в данном примере я не замарачиваюсь, что иногда делитель составное число
            //по умолчанию число простое
            computerAnswer = "yes";
            for (int j = 2; j < Math.sqrt((double) number); j++) {
                if (number % j == 0) {
                    computerAnswer = "no";
                    break;
                }
            }

            task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            question = String.valueOf(number);

            taskList.add(task);
            questionList.add(String.valueOf(question));
            computerAnswerList.add(computerAnswer);
        }

        Engine.engine(taskList, questionList, computerAnswerList, LIFE_OF_GAME);

    }
}
