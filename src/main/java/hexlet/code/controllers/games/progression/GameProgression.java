package hexlet.code.controllers.games.progression;

import hexlet.code.controllers.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameProgression {
    public static void gameProgression() {
        //массив для хранения арифметической прогрессии
        //мин 5 ячеек мах 15
        int[] mathArr = new int[5 + RandomNumberForGame.randomRandom(10)];
        mathArr[0] = 1;
        //генерация случайного шага
        int step = RandomNumberForGame.randomRandom(9);
        //заполнение массива арифметической прогрессией
        for (int i = 1; i < mathArr.length; i++) {
            mathArr[i] = mathArr[i - 1] + step;
        }
        System.out.println("What number is missing in the progression?");
        System.out.println("Question: ");
        //генерация индекса для пропуска при выводе
        //массива на экран
        int index = RandomNumberForGame.randomRandom(mathArr.length);
        //цифра которая будет пропущена
        int answerComputer = mathArr[index - 1];
        for (int i = 0; i < mathArr.length; i++) {
            if (i == index - 1) {
                System.out.print("*** ");
                continue;
            }
            System.out.print(mathArr[i] + " ");
        }
        //перевод гашетки после вывода на экран массива
        System.out.println();
        int answerPlayer = ScannerIn.scannerInInt();
        System.out.println("Your answer: " + answerPlayer);
        ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
    }
}
