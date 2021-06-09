package hexlet.code.controllers;

import java.util.Random;
//генерация чисел int от 0 до 100

public class RandomForGame {
        public static int numberAt100() {
            Random rd = new Random();
            return Integer.valueOf(rd.nextInt(99) + 1);
        }
}
