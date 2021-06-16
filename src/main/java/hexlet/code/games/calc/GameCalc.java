package hexlet.code.games.calc;

import hexlet.code.utils.UtilsCommunicationWithThePlayer;
import hexlet.code.utils.UtilsInAndOutController;
import hexlet.code.utils.UtilsForGames;

public class GameCalc {
    private static final int MAX_LIMIT = 100;
    private static final int MAX_RAND_FOR_SIGN = 9;
    private static final int MAX_LIMIT_PLUS = 3;
    private static final int MAX_LIMIT_MINUS = 6;
    private static final int MAX_LIMIT_MULTIPLICATION = 9;
    public static void gameCalc() {
        //формируем случайные числа и операнд
        int varA = UtilsForGames.randomRandom(MAX_LIMIT);
        int varB = UtilsForGames.randomRandom(MAX_LIMIT);
        int varSign = UtilsForGames.randomRandom(MAX_RAND_FOR_SIGN);

        String sign;
        int answerPlayer;
        int answerComputer;

        //используется кубик с 9ю гранями для
        //повышения вариативности
        //сложение
        if (varSign <= MAX_LIMIT_PLUS) {
            sign = " + ";
            UtilsCommunicationWithThePlayer.gameInterfaceQuestion("What is the result of the expression?",
                                                                             varA, sign, varB);
            answerPlayer = UtilsInAndOutController.scannerInInt();
            answerComputer = varA + varB;
            UtilsCommunicationWithThePlayer.gameInterfaceAnswer(answerPlayer);
            UtilsForGames.comparisonTwoInt(answerPlayer, answerComputer);
        }

        //вычитание
        if (varSign > MAX_LIMIT_PLUS && varSign <= MAX_LIMIT_MINUS) {
            sign = " - ";
            UtilsCommunicationWithThePlayer.gameInterfaceQuestion("What is the result of the expression?",
                                                                            varA, sign, varB);
            answerPlayer = UtilsInAndOutController.scannerInInt();
            answerComputer = varA - varB;
            UtilsCommunicationWithThePlayer.gameInterfaceAnswer(answerPlayer);
            UtilsForGames.comparisonTwoInt(answerPlayer, answerComputer);
        }

        //умножение
        if (varSign > MAX_LIMIT_MINUS && varSign <= MAX_LIMIT_MULTIPLICATION) {
            sign = " * ";
            UtilsCommunicationWithThePlayer.gameInterfaceQuestion("What is the result of the expression?",
                                                                            varA, sign, varB);
            answerPlayer = UtilsInAndOutController.scannerInInt();
            answerComputer = varA * varB;
            UtilsCommunicationWithThePlayer.gameInterfaceAnswer(answerPlayer);
            UtilsForGames.comparisonTwoInt(answerPlayer, answerComputer);
        }


    }
}
