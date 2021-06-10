package hexlet.code.view;

import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.controllers.SearchGCD;

public class GameGCD {
    public static void gameGCD() {
        //формируем две случайные переменные
        int varA = RandomNumberForGame.numberAt1000();
        int varB = RandomNumberForGame.numberAt1000();
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question " + varA + ", " + varB);
        //запрос от игрока ответа
        int answerPlayer = ScannerIn.scannerInInt();
        int answerComputer = SearchGCD.searchGCD(varA,varB);
        System.out.println("Your answer: " + answerPlayer);
        //если ответ не совпадает, закрытие программы
        if (answerComputer != answerPlayer) {
            System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answerComputer
            );
            ExitProgram.exitProgram("exit");
        }

        System.out.println("Correct!");

    }
}
