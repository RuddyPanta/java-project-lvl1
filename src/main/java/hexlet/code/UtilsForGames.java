package hexlet.code;

import java.util.Random;

public class UtilsForGames {

    //генерация числа с случайным максимальным значением
    public static int randomRandom(int number) {
        Random rd = new Random();
        return Integer.valueOf(rd.nextInt(number) + 1);
    }
}
