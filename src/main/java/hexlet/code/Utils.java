package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int MAX_LIMIT = 100;

    //генерация числа со случайным максимальным значением
    public static int randomRandom(int number) {
        Random rd = new Random();
        return Integer.valueOf(rd.nextInt(number) + 1);
    }
}
