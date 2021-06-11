package hexlet.code.controllers.games.gcd;

import hexlet.code.controllers.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameGCD {
    private static final int MAX_LIMIT = 1000;
    public static void gameGCD() {
        //формируем две случайные переменные
        int varA = RandomNumberForGame.randomRandom(MAX_LIMIT);
        int varB = RandomNumberForGame.randomRandom(MAX_LIMIT);
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question " + varA + " " + varB);
        //запрос от игрока ответа
        int answerPlayer = ScannerIn.scannerInInt();
        int answerComputer = SearchGCD.searchGCD(varA, varB);
        System.out.println("Your answer: " + answerPlayer);
        //если ответ не совпадает, закрытие программы
        ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);


    }
}
