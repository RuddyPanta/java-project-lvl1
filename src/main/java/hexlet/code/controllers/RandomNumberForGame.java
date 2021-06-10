package hexlet.code.controllers;

import java.util.Random;
//генерация случайных чисел

public class RandomNumberForGame {
        //генерация числа от 1 до 100
        public static int numberAt100() {
            Random rd = new Random();
            return Integer.valueOf(rd.nextInt(99) + 1);
        }
        public static int numberAt1000() {
            Random rd = new Random();
            return Integer.valueOf(rd.nextInt(999) + 1);
        }
        //генерация числа от 1 до 9
        public static int randomSign() {
            Random rd = new Random();
            return Integer.valueOf(rd.nextInt(8) + 1);
        }
}
