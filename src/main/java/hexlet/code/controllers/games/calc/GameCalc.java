package hexlet.code.controllers.games.calc;

import hexlet.code.controllers.ComparisonTwoInt;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameCalc {
    private static final int MAX_LIMIT = 100;
    private static final int MAX_RAND_FOR_SIGN = 9;
    private static final int MAX_LIMIT_PLUS = 3;
    private static final int MAX_LIMIT_MINUS = 6;
    private static final int MAX_LIMIT_MULTIPLICATION = 9;
    public static void gameCalc() {
        //формируем случайные числа и операнд
        int varA = RandomNumberForGame.randomRandom(MAX_LIMIT);
        int varB = RandomNumberForGame.randomRandom(MAX_LIMIT);
        int varSign = RandomNumberForGame.randomRandom(MAX_RAND_FOR_SIGN);
        System.out.println("What is the result of the expression?");
        int answerPlayer;
        int answerComputer;
        //используется кубик с 9ю гранями для
        //повышения вариативности
        //сложение
        if (varSign <= MAX_LIMIT_PLUS) {
            System.out.println("Question: " + varA + " + " + varB);
            answerPlayer = ScannerIn.scannerInInt();
            answerComputer = varA + varB;
            System.out.println("Your answer: " + answerPlayer);
            ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
        }
        //вычитание
        if (varSign > MAX_LIMIT_PLUS && varSign <= MAX_LIMIT_MINUS) {
            System.out.println("Question: " + varA + " - " + varB);
            answerPlayer = ScannerIn.scannerInInt();
            answerComputer = varA - varB;
            System.out.println("Your answer: " + answerPlayer);
            ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
        }
        //умножение
        if (varSign > MAX_LIMIT_MINUS && varSign <= MAX_LIMIT_MULTIPLICATION) {
            System.out.println("Question: " + varA + " * " + varB);
            answerPlayer = ScannerIn.scannerInInt();
            answerComputer = varA * varB;
            System.out.println("Your answer: " + answerPlayer);
            ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
        }


    }
}
