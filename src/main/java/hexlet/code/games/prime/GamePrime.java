package hexlet.code.games.prime;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

public class GamePrime {

    private static final int MAX_LIMIT = 500;
    private static final int GAME_TYPE = 1;

    public static void gamePrime() {

        //генерируем число
        int number = UtilsForGames.randomRandom(MAX_LIMIT);

        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //в данном примере я не замарачиваюсь, что иногда делитель составное число
        //по умолчанию число простое
        String computerAnswer = "yes";
        for (int i = 2; i < Math.sqrt((double) number); i++) {
            if (number % i == 0) {
                computerAnswer = "no";
                break;
            }
        }

        String tack = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String question = String.valueOf(number);

        Engine.engine(tack, question, GAME_TYPE, computerAnswer);

    }
}
