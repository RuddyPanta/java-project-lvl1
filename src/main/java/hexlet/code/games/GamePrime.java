package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class GamePrime {

    private static final String QUESTION_CONSOLE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //по умолчанию число простое
        for (int j = 2; j < Math.sqrt((double) number); j++) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static void gamePrime() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            //генерируем число
            int number = Utils.randomRandom(Utils.MAX_LIMIT);

            computerAnswers.add(isPrime(number) ? "yes" : "no");
            questions.add(String.valueOf(number));
        }

        Engine.run(QUESTION_CONSOLE, questions, computerAnswers);

    }
}
