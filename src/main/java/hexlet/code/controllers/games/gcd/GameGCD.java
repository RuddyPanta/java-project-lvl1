package hexlet.code.controllers.games.gcd;

import hexlet.code.controllers.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameGCD {
    public static void gameGCD() {
        //формируем две случайные переменные
        int varA = RandomNumberForGame.randomRandom(1000);
        int varB = RandomNumberForGame.randomRandom(1000);
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question " + varA + ", " + varB);
        //запрос от игрока ответа
        int answerPlayer = ScannerIn.scannerInInt();
        int answerComputer = SearchGCD.searchGCD(varA, varB);
        System.out.println("Your answer: " + answerPlayer);
        //если ответ не совпадает, закрытие программы
        ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);


    }
}
