package hexlet.code.games.prime;

import hexlet.code.games.Engine;
import hexlet.code.games.Game;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GamePrime {

     private static String isPrime(int number) {
        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //в данном примере я не замарачиваюсь, что иногда делитель составное число
        //по умолчанию число простое
        for (int j = 2; j < Math.sqrt((double) number); j++) {
            if (number % j == 0) {
                return  "no";
            }
        }

        return "yes";
    }

    public static void gamePrime() {

        int number;

        List<String> questions = new ArrayList<>(Engine.getLifeOfGame());
        List<String> computerAnswers = new ArrayList<>(Engine.getLifeOfGame());

        for (int i = 0; i < Engine.getLifeOfGame(); i++) {
            //генерируем число
            number = UtilsForGames.randomRandom(Engine.getMaxLimit());

            computerAnswers.add(isPrime(number));
            questions.add(String.valueOf(String.valueOf(number)));
        }

        Engine.run(Game.PRIME, questions, computerAnswers);

    }
}
