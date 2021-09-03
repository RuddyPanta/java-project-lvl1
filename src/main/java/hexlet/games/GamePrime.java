package hexlet.games;

import hexlet.code.UtilsForGames;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class GamePrime {

    private static final String PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //в данном примере я не замарачиваюсь, что иногда делитель составное число
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
            int number = UtilsForGames.randomRandom(Engine.MAX_LIMIT);

            computerAnswers.add(isPrime(number) ? "yes" : "no");
            questions.add(String.valueOf(number));
        }

        Engine.run(PRIME, questions, computerAnswers);

    }
}
