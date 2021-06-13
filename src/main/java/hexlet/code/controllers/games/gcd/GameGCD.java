package hexlet.code.controllers.games.gcd;

import hexlet.code.controllers.games.calc.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.view.GamesInterface;

public class GameGCD {
    private static final int MAX_LIMIT = 1000;
    public static void gameGCD() {
        //формируем две случайные переменные
        int varA = RandomNumberForGame.randomRandom(MAX_LIMIT);
        int varB = RandomNumberForGame.randomRandom(MAX_LIMIT);

        String sign = " ";

        GamesInterface.gameInterfaceQuestion("Find the greatest common divisor of given numbers.",
                                                        varA, sign, varB);

        //запрос от игрока ответа
        int answerPlayer = ScannerIn.scannerInInt();
        int answerComputer = SearchGCD.searchGCD(varA, varB);

        GamesInterface.gameInterfaceAnswer(answerPlayer);

        //если ответ не совпадает, закрытие программы
        ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);


    }
}
