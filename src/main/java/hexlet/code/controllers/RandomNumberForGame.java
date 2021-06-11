package hexlet.code.controllers;

import java.util.Random;
//генерация случайных чисел

public class RandomNumberForGame {
      //генерация числа с случайным максимальным значением
    public static int randomRandom(int number) {
        Random rd = new Random();
        return Integer.valueOf(rd.nextInt(number) + 1);
    }
}
