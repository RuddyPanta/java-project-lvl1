package hexlet.code.controllers.games.progression;

import hexlet.code.controllers.games.calc.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.view.GamesInterface;

public class GameProgression {
    private static final int MAX_LIMIT = 10;
    private static final int MIN_LIMIT = 5;
    private static final int MAX_STEP = 9;

    public static void gameProgression() {
        //массив для хранения арифметической прогрессии
        //мин 5 ячеек мах 15
        int[] mathArr = new int[MIN_LIMIT + RandomNumberForGame.randomRandom(MAX_LIMIT)];
        mathArr[0] = 1;

        //генерация случайного шага
        int step = RandomNumberForGame.randomRandom(MAX_STEP);

        //заполнение массива арифметической прогрессией
        for (int i = 1; i < mathArr.length; i++) {
            mathArr[i] = mathArr[i - 1] + step;
        }

        //генерация индекса для пропуска при выводе
        //массива на экран
        int index = RandomNumberForGame.randomRandom(mathArr.length);

        //цифра которая будет пропущена
        int answerComputer = mathArr[index - 1];
        //куда будет собираться массив и символ пропуска
        StringBuilder sb = new StringBuilder();
        String space = " ";

        for (int i = 0; i < mathArr.length; i++) {
            if (i == index - 1) {
                sb.append(".." + space);
                continue;
            }
            sb.append(mathArr[i] + space);
        }

        String doneSB = sb.toString();

        GamesInterface.gameInterfaceQuestion("What number is missing in the progression?", doneSB);

        int answerPlayer = ScannerIn.scannerInInt();

        GamesInterface.gameInterfaceAnswer(answerPlayer);
        ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
    }
}
